{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/xml/DocumentContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DocumentContainer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.xml.XMLParser2",
        "org.apache.commons.jxpath.Container"
      ],
      "begin_line": 39,
      "end_line": 189,
      "comment": "\n * An XML document container reads and parses XML only when it is\n * accessed.  JXPath traverses Containers transparently -\n * you use the same paths to access objects in containers as you\n * do to access those objects directly.  You can create\n * XMLDocumentContainers for various XML documents that may or\n * may not be accessed by XPaths.  If they are, they will be automatically\n * read, parsed and traversed. If they are not - they won\u0027t be\n * read at all.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_DOM"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " DOM constant "
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_JDOM"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " JDOM constant "
    },
    {
      "type": "field",
      "varNames": [
        "document"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlURL"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "model"
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
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, org.apache.commons.jxpath.xml.XMLParser)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Add an XML parser.  Parsers for the models \"DOM\" and \"JDOM\" are\n     * pre-registered.\n     * @param model model name\n     * @param parser parser\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, java.lang.String)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Add a class of a custom XML parser.\n     * Parsers for the models \"DOM\" and \"JDOM\" are pre-registered.\n     * @param model model name\n     * @param parserClassName parser classname\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Use this constructor if the desired model is DOM.\n     *\n     * @param xmlURL is a URL for an XML file.\n     * Use getClass().getResource(resourceName) to load XML from a\n     * resource file.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL, java.lang.String)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Construct a new DocumentContainer.\n     * @param xmlURL is a URL for an XML file. Use getClass().getResource\n     *               (resourceName) to load XML from a resource file.\n     *\n     * @param model is one of the MODEL_* constants defined in this class. It\n     *              determines which parser should be used to load the XML.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getValue()",
      "begin_line": 112,
      "end_line": 135,
      "comment": "\n     * Reads XML, caches it internally and returns the Document.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.parseXML(java.io.InputStream)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * Parses XML using the parser for the specified model.\n     * @param stream InputStream\n     * @return Object\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.setValue(java.lang.Object)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Throws an UnsupportedOperationException.\n     * @param value value (not) to set\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getParser(java.lang.String)",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Maps a model type to a parser.\n     * @param model input model type\n     * @return XMLParser\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 22)"
      ]
    }
  ]
}