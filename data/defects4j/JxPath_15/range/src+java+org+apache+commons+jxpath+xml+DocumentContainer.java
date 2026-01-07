{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/xml/DocumentContainer.java",
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
      "end_line": 175,
      "comment": "\n * An XML document container reads and parses XML only when it is\n * accessed.  JXPath traverses Containers transparently -\n * you use the same paths to access objects in containers as you\n * do to access those objects directly.  You can create\n * XMLDocumentContainers for various XML documents that may or\n * may not be accessed by XPaths.  If they are, they will be automatically\n * read, parsed and traversed. If they are not - they won\u0027t be\n * read at all.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_DOM"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODEL_JDOM"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "document"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlURL"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "model"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserClasses"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsers"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, org.apache.commons.jxpath.xml.XMLParser)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Add an XML parser.  Parsers for the models \"DOM\" and \"JDOM\" are\n     * pre-registered.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser(java.lang.String, java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Add a class of a custom XML parser. \n     * Parsers for the models \"DOM\" and \"JDOM\" are pre-registered.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Use this constructor if the desired model is DOM.\n     *\n     * @param xmlURL is a URL for an XML file.\n     * Use getClass().getResource(resourceName) to load XML from a\n     * resource file.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.DocumentContainer(java.net.URL, java.lang.String)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * @param xmlURL is a URL for an XML file. Use getClass().getResource\n     * (resourceName) to load XML from a resource file.\n     *\n     * @param model is one of the MODEL_* constants defined in this class. It\n     *   determines which parser should be used to load the XML.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getValue()",
      "begin_line": 103,
      "end_line": 126,
      "comment": "\n     * Reads XML, caches it internally and returns the Document.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.parseXML(java.io.InputStream)",
      "begin_line": 131,
      "end_line": 144,
      "comment": "\n     * Parses XML using the parser for the specified model.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.setValue(java.lang.Object)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Throws an UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.DocumentContainer.getParser(java.lang.String)",
      "begin_line": 156,
      "end_line": 174,
      "comment": "\n     * Maps a model type to a parser.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 58)",
        "(line 158,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 22)"
      ]
    }
  ]
}