{
  "filepath": "/tmp/JxPath-9b/src/java/org/apache/commons/jxpath/XMLDocumentContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLDocumentContainer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Container"
      ],
      "begin_line": 44,
      "end_line": 104,
      "comment": "\n * An XML document container reads and parses XML only when it is\n * accessed.  JXPath traverses Containers transparently -\n * you use the same paths to access objects in containers as you\n * do to access those objects directly.  You can create\n * XMLDocumentContainers for various XML documents that may or\n * may not be accessed by XPaths.  If they are, they will be automatically\n * read, parsed and traversed. If they are not - they won\u0027t be\n * read at all.\n *\n * @deprecated 1.1 Please use org.apache.commons.jxpath.xml.DocumentContainer\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
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
        "source"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.XMLDocumentContainer(java.net.URL)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * @param xmlURL is a URL for an XML file. Use getClass().getResource\n     * (resourceName) to load XML from a resource file.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.XMLDocumentContainer(javax.xml.transform.Source)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 29)",
        "(line 62,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.getValue()",
      "begin_line": 70,
      "end_line": 96,
      "comment": "\n     * Reads XML, caches it internally and returns the Document.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.setValue(java.lang.Object)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Throws an UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 50)"
      ]
    }
  ]
}