{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/xml/XMLParser2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLParser2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.xml.XMLParser"
      ],
      "begin_line": 28,
      "end_line": 145,
      "comment": "\n * The abstract superclass of XML parsers that produce DOM Documents.\n * The features have the same defaults as {@link javax.xml.parsers.DocumentBuilderFactory}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "validating"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceAware"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitespace"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expandEntityRef"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreComments"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coalescing"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setValidating(boolean)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Set whether the underlying parser should be validating.\n     * @param validating flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setValidating(boolean)\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isValidating()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Learn whether the underlying parser is validating.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isValidating()\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isNamespaceAware()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Learn whether the underlying parser is ns-aware.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isNamespaceAware()\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setNamespaceAware(boolean)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Set whether the underlying parser is ns-aware.\n     * @param namespaceAware flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setNamespaceAware(boolean)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setIgnoringElementContentWhitespace(boolean)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Set whether the underlying parser is ignoring whitespace.\n     * @param whitespace flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setIgnoringElementContentWhitespace(boolean)\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isIgnoringElementContentWhitespace()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Learn whether the underlying parser is ignoring whitespace.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isIgnoringElementContentWhitespace()\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isExpandEntityReferences()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Learn whether the underlying parser expands entity references.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isExpandEntityReferences()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setExpandEntityReferences(boolean)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Set whether the underlying parser expands entity references.\n     * @param expandEntityRef flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setExpandEntityReferences(boolean)\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isIgnoringComments()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Learn whether the underlying parser ignores comments.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isIgnoringComments()\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setIgnoringComments(boolean)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Set whether the underlying parser ignores comments.\n     * @param ignoreComments flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setIgnoringComments(boolean)\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.isCoalescing()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Learn whether the underlying parser is coalescing.\n     * @return boolean\n     * @see javax.xml.parsers.DocumentBuilderFactory#isCoalescing()\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.setCoalescing(boolean)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Set whether the underlying parser is coalescing.\n     * @param coalescing flag\n     * @see javax.xml.parsers.DocumentBuilderFactory#setCoalescing(boolean)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.xml.XMLParser2.parseXML(java.io.InputStream)",
      "begin_line": 144,
      "end_line": 144,
      "comment": "",
      "child_ranges": []
    }
  ]
}