{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/xml/DocumentContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DocumentContainer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.xml.XMLParser2",
        "org.apache.commons.jxpath.Container"
      ],
      "begin_line": 41,
      "end_line": 193,
      "comment": "\n * An XML document container reads and parses XML only when it is\n * accessed.  JXPath traverses Containers transparently -\n * you use the same paths to access objects in containers as you\n * do to access those objects directly.  You can create\n * XMLDocumentContainers for various XML documents that may or\n * may not be accessed by XPaths.  If they are, they will be automatically\n * read, parsed and traversed. If they are not - they won\u0027t be\n * read at all.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_DOM"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " DOM constant "
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_JDOM"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " JDOM constant "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserClasses"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsers"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "document"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlURL"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "model"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, org.apache.commons.jxpath.xml.XMLParser)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Add an XML parser.  Parsers for the models \"DOM\" and \"JDOM\" are\n     * pre-registered.\n     * @param model model name\n     * @param parser parser\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Add a class of a custom XML parser.\n     * Parsers for the models \"DOM\" and \"JDOM\" are pre-registered.\n     * @param model model name\n     * @param parserClassName parser classname\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Use this constructor if the desired model is DOM.\n     *\n     * @param xmlURL is a URL for an XML file.\n     * Use getClass().getResource(resourceName) to load XML from a\n     * resource file.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL, java.lang.String)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * Construct a new DocumentContainer.\n     * @param xmlURL is a URL for an XML file. Use getClass().getResource\n     *               (resourceName) to load XML from a resource file.\n     *\n     * @param model is one of the MODEL_* constants defined in this class. It\n     *              determines which parser should be used to load the XML.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getValue()",
      "begin_line": 116,
      "end_line": 139,
      "comment": "\n     * Reads XML, caches it internally and returns the Document.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.parseXML(java.io.InputStream)",
      "begin_line": 146,
      "end_line": 159,
      "comment": "\n     * Parses XML using the parser for the specified model.\n     * @param stream InputStream\n     * @return Object\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.setValue(java.lang.Object)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Throws an UnsupportedOperationException.\n     * @param value value (not) to set\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getParser(java.lang.String)",
      "begin_line": 174,
      "end_line": 192,
      "comment": "\n     * Maps a model type to a parser.\n     * @param model input model type\n     * @return XMLParser\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 22)"
      ]
    }
  ]
}