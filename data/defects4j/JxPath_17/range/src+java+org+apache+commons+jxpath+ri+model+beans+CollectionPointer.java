{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 305,
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
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Create a new CollectionPointer.\n     * @param collection value\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 28)",
        "(line 49,col 9)-(line 49,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.CollectionPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Create a new CollectionPointer.\n     * @param parent parent NodePointer\n     * @param collection value\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)",
        "(line 59,col 9)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getName()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getBaseValue()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isCollection()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getLength()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isLeaf()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.isContainer()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getImmediateNode()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setValue(java.lang.Object)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.setIndex(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getValuePointer()",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 180,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 186,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 191,col 28)",
        "(line 192,col 9)-(line 192,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.hashCode()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.equals(java.lang.Object)",
      "begin_line": 205,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 221,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 238,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespaceIterator()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.namespacePointer(java.lang.String)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 258,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionPointer.asPath()",
      "begin_line": 282,
      "end_line": 304,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 49)",
        "(line 284,col 9)-(line 284,col 57)",
        "(line 285,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 33)"
      ]
    }
  ]
}