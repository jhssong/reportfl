{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 237,
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
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.CollectionPointer(java.lang.Object, java.util.Locale)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Create a new CollectionPointer.\n     * @param collection value\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 28)",
        "(line 51,col 9)-(line 51,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.CollectionPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a new CollectionPointer.\n     * @param parent parent NodePointer\n     * @param collection value\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getName()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getBaseValue()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isCollection()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getLength()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isLeaf()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)",
        "(line 82,col 9)-(line 82,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isContainer()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getImmediateNode()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setValue(java.lang.Object)",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setIndex(int)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)",
        "(line 105,col 9)-(line 105,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getValuePointer()",
      "begin_line": 108,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 46)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 132,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.hashCode()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.equals(java.lang.Object)",
      "begin_line": 158,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 61)",
        "(line 168,col 9)-(line 168,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 171,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 185,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespaceIterator()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespacePointer(java.lang.String)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.asPath()",
      "begin_line": 214,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 49)",
        "(line 216,col 9)-(line 216,col 57)",
        "(line 217,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 33)"
      ]
    }
  ]
}