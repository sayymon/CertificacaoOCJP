package br.certificacao.ocjp6.conteudoAPI;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

/**
 * <h1>Datas</h1>
 * 
 * Para tratamento de datas a primeira classe a ser criada para o JAVA foi a
 * {@link Date} que representa instantes de tempo e é utilizada nas classes de
 * formatação de datas.<br/>
 * O Construtor default <code>Date()</code> retorna o instante atual conforme a
 * localidade. O Construtor <code>Date(long l)</code> é utilizado para
 * configurar uma data a partir de 1 de jan de 1970 através da quantidade de
 * milissegundos. O método <code>getTime()</code> é utilizado para capturar a
 * quantidade de milissegundos desde a data de 1 de jan de 1970 .
 * 
 * <h2>{@link Calendar}</h2><br/>
 * É uma classe abstrata e é mais flexível do que date foi projetada para
 * representar um calendário de diversas localidades.<br/>
 * É herdada por {@link java.util.GregorianCalendar}<br/>
 * 
 * O construtor default usa o {@link Locale} da maquina para carregar as
 * informações do instante do qual foi executado. e também possui um construtor
 * que recebe o {@link Locale} como argumento para aplicar a
 * internacionalização.<br/>
 * Calendar oferece uma série de constantes numéricas que representam cada uma
 * diversos de elementos de um calendário
 * <table border='1'>
 * <tr>
 * <td>
 * <strong>Constante</strong></td>
 * <td>
 * <strong>Convenção para GregorianCalendar</strong></td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.YEAR</td>
 * <td>
 * Representa o Ano Corrente</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.MONTH</td>
 * <td>
 * 0-Janeiro ...11-Dezembro</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.WEEK_OF_YEAR</td>
 * <td>
 * 1ªsemana do ano ... 53ª Ultima Semana do ano</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.WEEK_OF_MONTH</td>
 * <td>
 * 1ªsemana do Mês ... 4ª Ultima Semana do Mês</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.DAY_OF_MONTH e Calendar.DATE</td>
 * <td>
 * Representam o dia do mês 1 a 31</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.DAY_OF_WEEK</td>
 * <td>
 * Dia da Semana 1 = domingo ... 7 = sábado</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.DAY_OF_WEEK</td>
 * <td>
 * Representa o dia do ANO de 1 a 365 ou 366</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.HOUR</td>
 * <td>
 * Hora de 0 a 11</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.HOUR_OF_DAY</td>
 * <td>
 * Hora do dia de 0 a 23</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.MINUTE</td>
 * <td>
 * Minutos de uma hora de 0 a 59</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.SECOND</td>
 * <td>
 * Segundos de um minuto de 0 a 59</td>
 * </tr>
 * <tr>
 * <td>
 * Calendar.MILISECOND</td>
 * <td>
 * MiliSegundos de um segundo de 0 a 999</td>
 * </tr>
 * </table>
 * 
 * @author Saymon
 * 
 */
public class Datas {

	public final static long SEGUNDOS_EM_MILISSEGUNDOS = 1000;
	public final static long MINUTOS_EM_MILISSEGUNDOS = 60000;
	public final static long HORA_EM_MILISSEGUNDOS = 3600000;
	public final static long DIA_EM_MILISSEGUNDOS = 86400000;
	public final static long MES_EM_MILISSEGUNDOS = 2592000000L;
	public final static long ANO_EM_MILISSEGUNDOS = 31104000000L;

	/**
	 * <h3>Exemplo de Date</h3> <blockquote>
	 * 
	 * <pre>
	 * System.out.println(new Date());
	 * </pre>
	 * 
	 * </blockquote> Apresenta : Fri Apr 04 08:45:30 BRT 2014
	 * 
	 */
	public void exemploDate() {
		System.out.println("exemploDate " + new Date());

	}

	/**
	 * <h3>Exemplo de Date configurando uma data</h3> <blockquote>
	 * 
	 * <pre>
	 * System.out.println("Instante atual " + new Date());
	 * System.out.println("Somando 1 segundo "
	 * 		+ new Date(new Date().getTime() + Datas.SEGUNDOS_EM_MILISSEGUNDOS));
	 * System.out.println("Somando 1 Minuto "
	 * 		+ new Date(new Date().getTime() + Datas.MINUTOS_EM_MILISSEGUNDOS));
	 * System.out.println("Somando 1 Hora "
	 * 		+ new Date(new Date().getTime() + Datas.HORA_EM_MILISSEGUNDOS));
	 * System.out.println("Somando 1 Dia "
	 * 		+ new Date(new Date().getTime() + Datas.DIA_EM_MILISSEGUNDOS));
	 * System.out.println("Somando 1 Mês "
	 * 		+ new Date(new Date().getTime() + Datas.MES_EM_MILISSEGUNDOS));
	 * System.out.println("Somando 1 Ano "
	 * 		+ new Date(new Date().getTime() + Datas.ANO_EM_MILISSEGUNDOS));
	 * </pre>
	 * 
	 * </blockquote> Apresenta : Fri Apr 04 08:45:30 BRT 2014
	 * 
	 */
	public void exemploDateConfigurandoUmaData() {
		System.out.println("Instante atual " + new Date());
		System.out.println("Somando 1 segundo "
				+ new Date(new Date().getTime()
						+ Datas.SEGUNDOS_EM_MILISSEGUNDOS));
		System.out.println("Somando 1 Minuto "
				+ new Date(new Date().getTime()
						+ Datas.MINUTOS_EM_MILISSEGUNDOS));
		System.out.println("Somando 1 Hora "
				+ new Date(new Date().getTime() + Datas.HORA_EM_MILISSEGUNDOS));
		System.out.println("Somando 1 Dia "
				+ new Date(new Date().getTime() + Datas.DIA_EM_MILISSEGUNDOS));
		System.out.println("Somando 1 Mês "
				+ new Date(new Date().getTime() + Datas.MES_EM_MILISSEGUNDOS));
		System.out.println("Somando 1 Ano "
				+ new Date(new Date().getTime() + Datas.ANO_EM_MILISSEGUNDOS));

	}

	/**
	 * <h1>Exemplo Obtendo Instancia Calendar Locale Default</h1>
	 * 
	 * <pre>
	 * Calendar calendario = Calendar.getInstance();
	 * System.out.println(calendario);
	 * </pre>
	 * 
	 * Apresenta : <br/>
	 * <code>
	 * java.util.GregorianCalendar[time=1396616047519,<br/>
	 * areFieldsSet=true,<br/>
	 * areAllFieldsSet=true,<br/>
	 * lenient=true,<br/>
	 * zone=sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",<br/>
	 * offset=-10800000,<br/>
	 * dstSavings=3600000,<br/>
	 * useDaylight=true,<br/>
	 * transitions=129,<br/>
	 * lastRule=java.util.SimpleTimeZone[id=America/Sao_Paulo,<br/>
	 * offset=-10800000,<br/>
	 * dstSavings=3600000,<br/>
	 * useDaylight=true,<br/>
	 * startYear=0,<br/>
	 * startMode=3,<br/>
	 * startMonth=9,<br/>
	 * startDay=15,<br/>
	 * startDayOfWeek=1,<br/>
	 * startTime=0,<br/>
	 * startTimeMode=0,<br/>
	 * endMode=3,<br/>
	 * endMonth=1,<br/>
	 * endDay=15,<br/>
	 * endDayOfWeek=1,<br/>
	 * endTime=0,<br/>
	 * endTimeMode=0]],<br/>
	 * firstDayOfWeek=2,<br/>
	 * minimalDaysInFirstWeek=1,<br/>
	 * ERA=1,<br/>
	 * YEAR=2014,<br/>
	 * MONTH=3,<br/>
	 * WEEK_OF_YEAR=14,<br/>
	 * WEEK_OF_MONTH=1,<br/>
	 * DAY_OF_MONTH=4,<br/>
	 * DAY_OF_YEAR=94,<br/>
	 * DAY_OF_WEEK=6,<br/>
	 * DAY_OF_WEEK_IN_MONTH=1,<br/>
	 * AM_PM=0,<br/>
	 * HOUR=9,<br/>
	 * HOUR_OF_DAY=9,<br/>
	 * MINUTE=54,<br/>
	 * SECOND=7,<br/>
	 * MILLISECOND=519,<br/>
	 * ZONE_OFFSET=-10800000,<br/>
	 * DST_OFFSET=0]
	 * </code>
	 */
	public void exemploObtendoInstanciaCalendarDefault() {
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);

	}

	/**
	 * <h1>Exemplo Manipulando Datas com Calendar</h1>
	 * 
	 * <pre>
	 * Calendar calendario = Calendar.getInstance();
	 * System.out.println("Obtendo o Mes : " + calendario.get(Calendar.MONTH));
	 * calendario.set(Calendar.DAY_OF_MONTH, 20);
	 * System.out.println("Mudando o dia do Mes : "+ calendario.get(Calendar.DAY_OF_MONTH));
	 * calendario.set(Calendar.HOUR, 18);
	 * System.out.println("Mudando Hora do dia  : " + calendario.get(Calendar.HOUR));
	 * calendario.add(Calendar.YEAR, 10);
	 * System.out.println("Adicionando Anos  : " + calendario.get(Calendar.YEAR));
	 * System.out.println(calendario.getTime());
	 * // Altera o valor do item incrementado e no caso de exceder o limite
	 * // incrementa o proximo :
	 * calendario.add(Calendar.HOUR_OF_DAY, 25);
	 * System.out.println("Adicionando 1 dia e 1 hora  : "+ calendario.get(Calendar.HOUR_OF_DAY));
	 * System.out.println(calendario.getTime());
	 * // Altera o valor apenas o item especificado
	 * calendario.roll(Calendar.HOUR_OF_DAY, 25);
	 * System.out.println("Adicionando Horas apenas no Dia  : "+ calendario.get(Calendar.HOUR_OF_DAY));
	 * System.out.println(calendario.getTime());
	 * </pre>
	 * 
	 * <b>Resultado :</b><br/> <code>
	 * Obtendo o Mes : 3<br/>
	 * Mudando o dia do Mes : 20<br/>
	 * Mudando Hora do dia  : 6<br/>
	 * Adicionando Anos  : 2024<br/>
	 * Sat Apr 20 18:48:22 BRT 2024<br/>
	 * Adicionando 1 dia e 1 hora  : 19<br/>
	 * Sun Apr 21 19:48:22 BRT 2024<br/>
	 * Adicionando Horas apenas no Dia  : 20<br/>
	 * Sun Apr 21 20:48:22 BRT 2024<br/>
	 * </code>
	 * 
	 */
	public void exemploManipulandoDatasComCalendar() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Obtendo o Mes : " + calendario.get(Calendar.MONTH));
		calendario.set(Calendar.DAY_OF_MONTH, 20);
		System.out.println("Mudando o dia do Mes : "
				+ calendario.get(Calendar.DAY_OF_MONTH));
		calendario.set(Calendar.HOUR, 18);
		System.out.println("Mudando Hora do dia  : "
				+ calendario.get(Calendar.HOUR));
		calendario.add(Calendar.YEAR, 10);
		System.out.println("Adicionando Anos  : "
				+ calendario.get(Calendar.YEAR));

		System.out.println(calendario.getTime());
		// Altera o valor do item incrementado e no caso de exceder o limite
		// incrementa o proximo :
		calendario.add(Calendar.HOUR_OF_DAY, 25);
		System.out.println("Adicionando 1 dia e 1 hora  : "
				+ calendario.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendario.getTime());
		// Altera o valor apenas o item especificado
		calendario.roll(Calendar.HOUR_OF_DAY, 25);
		System.out.println("Adicionando Horas apenas no Dia  : "
				+ calendario.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendario.getTime());

	}

}
