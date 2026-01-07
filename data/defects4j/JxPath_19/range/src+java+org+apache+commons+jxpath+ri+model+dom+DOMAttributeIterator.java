{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMAttributeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMAttributeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 36,
      "end_line": 173,
      "comment": "\n * An iterator of attributes of a DOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.DOMAttributeIterator(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 47,
      "end_line": 71,
      "comment": "\n     * Create a new DOMAttributeIterator.\n     * @param parent pointer\n     * @param name to test\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 44)",
        "(line 52,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr(org.w3c.dom.Attr)",
      "begin_line": 78,
      "end_line": 104,
      "comment": "\n     * Test an attribute.\n     * @param attr to test\n     * @return whether test succeeded\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 65)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 46)",
        "(line 91,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Test whether two strings are \u003d\u003d or .equals()\n     * @param s1 first string\n     * @param s2 second string\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 122,
      "end_line": 149,
      "comment": "\n     * Get the named attribute.\n     * @param element to search\n     * @param name to match\n     * @return Attr found\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 29)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer()",
      "begin_line": 151,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getPosition()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.setPosition(int)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 62)"
      ]
    }
  ]
}