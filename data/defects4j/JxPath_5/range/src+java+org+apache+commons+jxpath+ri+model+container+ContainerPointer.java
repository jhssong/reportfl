{
  "filepath": "/tmp/JxPath-5b/src/java/org/apache/commons/jxpath/ri/model/container/ContainerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContainerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 36,
      "end_line": 155,
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
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 28)",
        "(line 42,col 9)-(line 42,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.ContainerPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.Container)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 22)",
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isContainer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * This type of node is auxiliary.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getName()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getBaseValue()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isCollection()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 38)",
        "(line 67,col 9)-(line 67,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getLength()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.isLeaf()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode()",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 38)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.setValue(java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer()",
      "begin_line": 92,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.hashCode()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.equals(java.lang.Object)",
      "begin_line": 104,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespaceIterator()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.namespacePointer(java.lang.String)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.container.ContainerPointer.asPath()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 54)"
      ]
    }
  ]
}