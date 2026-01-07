{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/dom/NamespacePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NamespacePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 31,
      "end_line": 179,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.NamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Create a new NamespacePointer.\n     * @param parent parent pointer\n     * @param prefix associated ns prefix.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 22)",
        "(line 42,col 9)-(line 42,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.NamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n     * Create a new NamespacePointer.\n     * @param parent parent pointer\n     * @param prefix associated ns prefix.\n     * @param namespaceURI associated ns URI.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getName()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getBaseValue()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.isCollection()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getLength()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getImmediateNode()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getNamespaceURI()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.isLeaf()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.setValue(java.lang.Object)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Throws UnsupportedOperationException.\n     * @param value Object\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 127,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.asPath()",
      "begin_line": 133,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 143,col 30)",
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.hashCode()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 59)",
        "(line 167,col 9)-(line 167,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.NamespacePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 17)"
      ]
    }
  ]
}