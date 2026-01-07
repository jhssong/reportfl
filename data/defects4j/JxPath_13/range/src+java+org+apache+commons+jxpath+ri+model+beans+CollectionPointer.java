{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 233,
      "comment": "\n * Transparent pointer to a collection (array or Collection).\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valuePointer"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.CollectionPointer(java.lang.Object, java.util.Locale)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 28)",
        "(line 44,col 9)-(line 44,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.CollectionPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)",
        "(line 49,col 9)-(line 49,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getName()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getBaseValue()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isCollection()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getLength()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isLeaf()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isContainer()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getImmediateNode()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setValue(java.lang.Object)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setIndex(int)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 93,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getValuePointer()",
      "begin_line": 96,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 120,col 28)",
        "(line 121,col 9)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 124,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 48)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 132,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.hashCode()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 61)",
        "(line 159,col 9)-(line 159,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 162,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 177,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespaceIterator()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespacePointer(java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 188,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.asPath()",
      "begin_line": 210,
      "end_line": 232,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 57)",
        "(line 213,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 33)"
      ]
    }
  ]
}