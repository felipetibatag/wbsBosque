package com.unbosque.edu.wbsBosque.controller;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.unbosque.edu.wbsBosque.entity.EstadisticaGeneral;
import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.wbsBosque.entity.Equipo;
import com.unbosque.edu.wbsBosque.entity.EstadisticaEquipo;
import com.unbosque.edu.wbsBosque.entity.Ganadores;
import com.unbosque.edu.wbsBosque.entity.HistoricoEquipo;
import com.unbosque.edu.wbsBosque.persistence.EquipoPersistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

@RestController

public class EquipoController {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	EquipoPersistence pp;

	private SimpleJdbcCall simpleJdbcCall ;


	@RequestMapping(value="/equipo/add",method=RequestMethod.POST)
	public Equipo addEquipo(@RequestParam String nombre, String grupo, String resena, String cod_pais){
		Equipo p=pp.save( new Equipo(nombre, grupo, resena, cod_pais));
		return p;
	}
	@RequestMapping(value="/equipo/delete",method=RequestMethod.POST)
	public void deleteEquipo(@RequestParam Integer id) {
		Equipo p = pp.getOne(id);
		 pp.delete(p);		
	}
	@RequestMapping(value="/equipo/set",method=RequestMethod.POST)
	public Equipo setEquipo(@RequestParam Integer id, String nombre, String grupo, String resena, String cod_pais) {
		Equipo p = pp.save(new Equipo(id, nombre, grupo, resena, cod_pais));
		return p;
	}
	@RequestMapping(value="/equipo/select",method=RequestMethod.POST)
	public Equipo findEquipo(@RequestParam Integer id) {
		Equipo p = pp.findOne(id);
		return p;
	}
	@RequestMapping(value="/equipo/selectAll",method=RequestMethod.POST)
	public List<Equipo> findAllEquipo() {
		List<Equipo> p = pp.findAll();
		return p;
	}


	@RequestMapping(value="/equipo/equipoPorGrupo",method=RequestMethod.POST)
	public List<Equipo> findEquipo2() {
		List<Equipo> p=pp.findByGrupoIsNotOrderByGrupoAsc("N");
		return p;
	}


	@RequestMapping(value="/equipo/estadisticasGenerales",method=RequestMethod.POST)
	public List<EstadisticaGeneral> estadisticas() {
        String sql ="call generarestadistica2();";
        List<EstadisticaGeneral> estadisticaGeneralList= new ArrayList<EstadisticaGeneral>();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            EstadisticaGeneral estadisticaGeneral= new EstadisticaGeneral();
            estadisticaGeneral.setId(Integer.parseInt(String.valueOf(row.get("id"))));
            estadisticaGeneral.setNombre((String)row.get("equipo"));
            estadisticaGeneral.setCod_pais((String)row.get("cod_pais"));
            estadisticaGeneral.setPj(Integer.parseInt(String.valueOf(row.get("pj"))));
            estadisticaGeneral.setPg(Integer.parseInt(String.valueOf(row.get("pg"))));
            estadisticaGeneral.setPe(Integer.parseInt(String.valueOf(row.get("pe"))));
            estadisticaGeneral.setPp(Integer.parseInt(String.valueOf(row.get("pp"))));
            estadisticaGeneral.setGf(Integer.parseInt(String.valueOf(row.get("gf"))));
            estadisticaGeneral.setGc(Integer.parseInt(String.valueOf(row.get("gc"))));
            estadisticaGeneral.setRendimiento(Float.valueOf(String.valueOf(row.get("rendimiento"))));
            estadisticaGeneralList.add(estadisticaGeneral);
        }
        return  estadisticaGeneralList;
	}
        
        
        @RequestMapping(value="/equipo/ganadores",method=RequestMethod.POST)
	public List<Ganadores> ganadores() {
        String sql ="call EstadísticaDefinitivo();";
        List<Ganadores> estadisticaGeneralList= new ArrayList<Ganadores>();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Ganadores estadisticaGeneral= new Ganadores();
            estadisticaGeneral.setId(Integer.parseInt(String.valueOf(row.get("id"))));
            estadisticaGeneral.setNombre((String)row.get("nombre"));
            estadisticaGeneral.setPj(Integer.parseInt(String.valueOf(row.get("pjugado"))));
            estadisticaGeneral.setPg(Integer.parseInt(String.valueOf(row.get("pganado"))));
            estadisticaGeneral.setPe(Integer.parseInt(String.valueOf(row.get("pempatado"))));
            estadisticaGeneral.setPp(Integer.parseInt(String.valueOf(row.get("pperdido"))));
            estadisticaGeneral.setGf(Integer.parseInt(String.valueOf(row.get("gfavor"))));
            estadisticaGeneral.setGc(Integer.parseInt(String.valueOf(row.get("gcontra"))));
            estadisticaGeneral.setSuma_t(Float.valueOf(String.valueOf(row.get("suma_t"))));
            estadisticaGeneralList.add(estadisticaGeneral);
        }
        return  estadisticaGeneralList;
	}
        

    @RequestMapping(value="/equipo/estadisticasGeneralesPorEquipo",method=RequestMethod.POST)
    public List<EstadisticaEquipo> estadisticasPorEquipo(@RequestParam Integer id) {
        
        String sql="CALL generarEstadisticaEquipo()";
        List<EstadisticaEquipo> estadisticaEquiposList= new ArrayList<EstadisticaEquipo>();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList("call generarEstadisticaEquipo(?)", id);
        
        for (Map row : rows) {
            EstadisticaEquipo estadisticaEquipo= new EstadisticaEquipo();
            estadisticaEquipo.setItem((String)row.get("item"));
            estadisticaEquipo.setTotal(Integer.parseInt(String.valueOf(row.get("total"))));
            estadisticaEquiposList.add(estadisticaEquipo);
        }
    return  estadisticaEquiposList;
    }
    
    @RequestMapping(value="/equipo/historicoPartidosPorEquipo",method=RequestMethod.POST)
    public List<HistoricoEquipo> historialPartidosPorEquipo(@RequestParam Integer id) {
        
        String sql="CALL generarEstadisticaEquipo()";
        List<HistoricoEquipo> historicoEquiposList= new ArrayList<HistoricoEquipo>();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList("call generarHistorialPartidosPorEquipo(?)", id);
        
        for (Map row : rows) {
            HistoricoEquipo historicoEquipo= new HistoricoEquipo();
            historicoEquipo.setFecha((String)row.get("fecha"));
            historicoEquipo.setEquipo1((String)row.get("equipo1"));
            historicoEquipo.setGolesseleccion1(Integer.parseInt(String.valueOf(row.get("golesseleccion1"))));
            historicoEquipo.setEquipo2((String)row.get("equipo2"));
            historicoEquipo.setGolesseleccion2(Integer.parseInt(String.valueOf(row.get("golesseleccion2"))));
            historicoEquiposList.add(historicoEquipo);
        }
    return  historicoEquiposList;
    }
    

    
 





}



