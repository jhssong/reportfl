{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/dom/NamespacePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NamespacePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 31,
      "end_line": 145,
      "comment": "\n * Represents a namespace node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceURI"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.NamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Create a new NamespacePointer.\n     * @param parent parent pointer\n     * @param prefix associated ns prefix.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 22)",
        "(line 44,col 9)-(line 44,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.NamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String, java.lang.String)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "\n     * Create a new NamespacePointer.\n     * @param parent parent pointer\n     * @param prefix associated ns prefix.\n     * @param namespaceURI associated ns URI.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)",
        "(line 58,col 9)-(line 58,col 29)",
        "(line 59,col 9)-(line 59,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getName()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getBaseValue()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.isCollection()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getLength()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getImmediateNode()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getNamespaceURI()",
      "begin_line": 82,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.isLeaf()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.setValue(java.lang.Object)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Throws UnsupportedOperationException.\n     * @param value Object\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.asPath()",
      "begin_line": 108,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 30)",
        "(line 119,col 9)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.hashCode()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.equals(java.lang.Object)",
      "begin_line": 126,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 59)",
        "(line 136,col 9)-(line 136,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 17)"
      ]
    }
  ]
}