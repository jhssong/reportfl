{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/xml/XMLParser2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLParser2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.xml.XMLParser"
      ],
      "begin_line": 28,
      "end_line": 122,
      "comment": "\n * The abstract superclass of XML parsers that produce DOM Documents.\n * The features have the same defaults as DocumentBuilderFactory.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "validating"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceAware"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitespace"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expandEntityRef"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreComments"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coalescing"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setValidating(boolean)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * @see DocumentBuilderFactory#setValidating(boolean)\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isValidating()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @see DocumentBuilderFactory#isValidating()\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isNamespaceAware()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @see DocumentBuilderFactory#isNamespaceAware()\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setNamespaceAware(boolean)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * @see DocumentBuilderFactory#setNamespaceAware(boolean)\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setIgnoringElementContentWhitespace(boolean)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * @see DocumentBuilderFactory#setIgnoringElementContentWhitespace(boolean)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isIgnoringElementContentWhitespace()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * @see DocumentBuilderFactory#isIgnoringElementContentWhitespace()\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isExpandEntityReferences()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * @see DocumentBuilderFactory#isExpandEntityReferences()\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setExpandEntityReferences(boolean)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @see DocumentBuilderFactory#setExpandEntityReferences(boolean)\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isIgnoringComments()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * @see DocumentBuilderFactory#isIgnoringComments()\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setIgnoringComments(boolean)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * @see DocumentBuilderFactory#setIgnoringComments(boolean)\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isCoalescing()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * @see DocumentBuilderFactory#isCoalescing()\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setCoalescing(boolean)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @see DocumentBuilderFactory#setCoalescing(boolean)\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.parseXML(java.io.InputStream)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "",
      "child_ranges": []
    }
  ]
}