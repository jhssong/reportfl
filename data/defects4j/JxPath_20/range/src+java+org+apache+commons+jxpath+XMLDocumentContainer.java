{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/XMLDocumentContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLDocumentContainer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Container"
      ],
      "begin_line": 44,
      "end_line": 111,
      "comment": "\n * An XML document container reads and parses XML only when it is\n * accessed.  JXPath traverses Containers transparently -\n * you use the same paths to access objects in containers as you\n * do to access those objects directly.  You can create\n * XMLDocumentContainers for various XML documents that may or\n * may not be accessed by XPaths.  If they are, they will be automatically\n * read, parsed and traversed. If they are not - they won\u0027t be\n * read at all.\n *\n * @deprecated 1.1 Please use {@link DocumentContainer}\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a new XMLDocumentContainer.\n     * @param xmlURL a URL for an XML file. Use getClass().getResource(resourceName)\n     *               to load XML from a resource file.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)",
        "(line 58,col 9)-(line 58,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.XMLDocumentContainer(javax.xml.transform.Source)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Create a new XMLDocumentContainer.\n     * @param source XML source\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 29)",
        "(line 67,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.getValue()",
      "begin_line": 76,
      "end_line": 102,
      "comment": "\n     * Reads XML, caches it internally and returns the Document.\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.XMLDocumentContainer.setValue(java.lang.Object)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Throws an UnsupportedOperationException\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 50)"
      ]
    }
  ]
}