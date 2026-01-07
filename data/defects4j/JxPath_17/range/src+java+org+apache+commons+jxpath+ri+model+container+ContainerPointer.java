{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/container/ContainerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContainerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 36,
      "end_line": 218,
      "comment": "\n * Transparent pointer to a Container. The getValue() method\n * returns the contents of the container, rather than the container\n * itself.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "container"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valuePointer"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.ContainerPointer(org.apache.commons.jxpath.Container, java.util.Locale)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Create a new ContainerPointer.\n     * @param container Container object\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)",
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.ContainerPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.Container)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Create a new ContainerPointer.\n     * @param parent parent pointer\n     * @param container Container object\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 22)",
        "(line 57,col 9)-(line 57,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isContainer()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * This type of node is auxiliary.\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getName()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getBaseValue()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isCollection()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)",
        "(line 87,col 9)-(line 87,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getLength()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 95,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isLeaf()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.setValue(java.lang.Object)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer()",
      "begin_line": 127,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.hashCode()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.equals(java.lang.Object)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 161,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespaceIterator()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespacePointer(java.lang.String)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(java.lang.String)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.asPath()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 54)"
      ]
    }
  ]
}