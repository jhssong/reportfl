{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 254,
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
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 71,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isContainer()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getImmediateNode()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setValue(java.lang.Object)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setIndex(int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 30)",
        "(line 98,col 9)-(line 98,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getValuePointer()",
      "begin_line": 101,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 43)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 125,col 28)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 129,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 48)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 140,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.hashCode()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.equals(java.lang.Object)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 164,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 167,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespaceIterator()",
      "begin_line": 189,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespacePointer(java.lang.String)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 203,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.asPath()",
      "begin_line": 230,
      "end_line": 253,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 49)",
        "(line 232,col 9)-(line 232,col 57)",
        "(line 233,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 33)"
      ]
    }
  ]
}