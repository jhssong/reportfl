{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNamespacePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNamespacePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 28,
      "end_line": 157,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.JDOMNamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Create a new JDOMNamespacePointer.\n     * @param parent parent pointer\n     * @param prefix ns prefix\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 22)",
        "(line 39,col 9)-(line 39,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.JDOMNamespacePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String, java.lang.String)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Create a new JDOMNamespacePointer.\n     * @param parent parent pointer\n     * @param prefix ns prefix\n     * @param namespaceURI ns URI\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)",
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getName()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getBaseValue()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.isCollection()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getLength()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getImmediateNode()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getNamespaceURI()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.isLeaf()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.setValue(java.lang.Object)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Throws UnsupportedOperationException.\n     * @param value Object value to set\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.asPath()",
      "begin_line": 120,
      "end_line": 132,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 49)",
        "(line 122,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 37)",
        "(line 130,col 9)-(line 130,col 30)",
        "(line 131,col 9)-(line 131,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.hashCode()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.equals(java.lang.Object)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 129)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 17)"
      ]
    }
  ]
}