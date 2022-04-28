<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xpath-default-namespace="http://example.org/manufacturer">
    <xsl:output method="text" encoding="UTF-8" indent="no"/>
    <xsl:variable name="prefix">http://example.org/manufacturer/</xsl:variable>
    <xsl:variable name="manufacturers">manufacturers/</xsl:variable>
    <xsl:variable name="prefixManufacturer" select="concat($prefix, $manufacturers)"/>
    <xsl:variable name="models">models/</xsl:variable>
    <xsl:variable name="prefixModel" select="concat($prefix, $models)"/>
    <xsl:variable name="plants">plants/</xsl:variable>
    <xsl:variable name="prefixPlant" select="concat($prefix, $plants)"/>   
<xsl:template match="vehicle">
@prefix vso: &lt;http://purl.org/vso/ns#&gt; .
@prefix mnfc: &lt;http://example.org/manufacturer/&gt; .
@prefix dbpedia-owl: &lt;http://dbpedia.org/ontology/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
    <xsl:variable name="manufacturerURI" select="concat($prefixManufacturer, encode-for-uri(manufacturer))"/>
    &lt;<xsl:value-of select="$manufacturerURI"/>&gt; a mnfc:Manufacturer ;
        dbpedia-owl:name &quot;<xsl:value-of select="manufacturer"/>&quot;^^xsd:string .

    <xsl:variable name="modelURI" select="concat($prefixModel, encode-for-uri(model))"/>
    &lt;<xsl:value-of select="$modelURI"/>&gt; a mnfc:VehicleModel ;
        dbpedia-owl:name &quot;<xsl:value-of select="model"/>&quot;^^xsd:string .

    <xsl:variable name="plantURI" select="concat($prefixPlant, encode-for-uri(manufacturedIn))"/>
    &lt;<xsl:value-of select="$plantURI"/>&gt; a mnfc:ManufacturingPlant ;
        dbpedia-owl:name &quot;<xsl:value-of select="manufacturedIn"/>&quot;^^xsd:string .

    <xsl:variable name="currentURI" select="concat($prefix, vin)"/>
    &lt;<xsl:value-of select="$currentURI"/>&gt; a vso:MotorizedRoadVehicle ;
        mnfc:manufacturedBy &lt;<xsl:value-of select="$manufacturerURI"/>&gt; ;
        mnfc:modelOf &lt;<xsl:value-of select="$modelURI"/>&gt; ;
        mnfc:manufacturedIn &lt;<xsl:value-of select="$plantURI"/>&gt; .
</xsl:template>
<xsl:template match="text()"/>   
</xsl:stylesheet>