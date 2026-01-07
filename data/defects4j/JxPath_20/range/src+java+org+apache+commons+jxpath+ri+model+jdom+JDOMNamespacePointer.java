{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNamespacePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNamespacePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 28,
      "end_line": 126,
      "comment": "\n * Represents a namespace node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceURI"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.JDOMNamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Create a new JDOMNamespacePointer.\n     * @param parent parent pointer\n     * @param prefix ns prefix\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 22)",
        "(line 41,col 9)-(line 41,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.JDOMNamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String, java.lang.String)",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * Create a new JDOMNamespacePointer.\n     * @param parent parent pointer\n     * @param prefix ns prefix\n     * @param namespaceURI ns URI\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 22)",
        "(line 55,col 9)-(line 55,col 29)",
        "(line 56,col 9)-(line 56,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getName()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getBaseValue()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.isCollection()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getLength()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getImmediateNode()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getNamespaceURI()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.isLeaf()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.setValue(java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Throws UnsupportedOperationException.\n     * @param value Object value to set\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.asPath()",
      "begin_line": 98,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 49)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.hashCode()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.equals(java.lang.Object)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 129)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 17)"
      ]
    }
  ]
}