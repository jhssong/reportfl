{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/container/ContainerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContainerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 36,
      "end_line": 166,
      "comment": "\n * Transparent pointer to a Container. The {@link #getValue()} method\n * returns the contents of the container, rather than the container\n * itself.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.ContainerPointer(org.apache.commons.jxpath.Container, java.util.Locale)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Create a new ContainerPointer.\n     * @param container Container object\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 28)",
        "(line 49,col 9)-(line 49,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.ContainerPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.Container)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Create a new ContainerPointer.\n     * @param parent parent pointer\n     * @param container Container object\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)",
        "(line 59,col 9)-(line 59,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isContainer()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * This type of node is auxiliary.\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getName()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getBaseValue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isCollection()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 80,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getLength()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 38)",
        "(line 85,col 9)-(line 85,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isLeaf()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode()",
      "begin_line": 92,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.setValue(java.lang.Object)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer()",
      "begin_line": 105,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.hashCode()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.equals(java.lang.Object)",
      "begin_line": 117,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 59)",
        "(line 127,col 9)-(line 127,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespaceIterator()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespacePointer(java.lang.String)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(java.lang.String)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.asPath()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 54)"
      ]
    }
  ]
}