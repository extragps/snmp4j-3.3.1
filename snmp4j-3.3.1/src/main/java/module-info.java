module org.snmp4j {
	exports org.snmp4j.uri;
	exports org.snmp4j.smi;
	exports org.snmp4j.security.nonstandard;
	exports org.snmp4j.tools.console;
	exports org.snmp4j.transport.tls;
	exports org.snmp4j.mp;
	exports org.snmp4j.version;
	exports org.snmp4j.log;
	exports org.snmp4j.transport;
	exports org.snmp4j.event;
	exports org.snmp4j.security;
	exports org.snmp4j.asn1;
	exports org.snmp4j.util;
	exports org.snmp4j.security.dh;
	exports org.snmp4j;

	requires java.logging;
}