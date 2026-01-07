{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/VariablePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariablePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 37,
      "end_line": 348,
      "comment": "\n * Pointer to a context variable.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
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
        "actual"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.VariablePointer(org.apache.commons.jxpath.Variables, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\n     * Create a new VariablePointer.\n     * @param variables Variables instance\n     * @param name variable name\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)",
        "(line 52,col 9)-(line 52,col 35)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.VariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Create a new (non-actual) VariablePointer.\n     * @param name variable name\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isContainer()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getName()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getBaseValue()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isLeaf()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isCollection()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 89,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getImmediateNode()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 95,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.setValue(java.lang.Object)",
      "begin_line": 98,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 28)",
        "(line 103,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isActual()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.setIndex(int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getImmediateValuePointer()",
      "begin_line": 121,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.Anonymous-1adf475c-99a1-4c6a-9c4e-015681bcae4f.getImmediateNode()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 25)-(line 133,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getLength()",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 149,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 46)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 159,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 173,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 61)",
        "(line 178,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 198,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 204,col 54)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 206,col 27)",
        "(line 207,col 9)-(line 207,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createCollection(org.apache.commons.jxpath.JXPathContext, int)",
      "begin_line": 216,
      "end_line": 242,
      "comment": "\n     * Create a collection.\n     * @param context JXPathContext\n     * @param index collection index\n     * @return Object\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 28)",
        "(line 219,col 9)-(line 219,col 43)",
        "(line 220,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.remove()",
      "begin_line": 244,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.findVariables(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 268,
      "end_line": 280,
      "comment": "\n     * Assimilate the Variables instance associated with the specified context.\n     * @param context JXPathContext to search\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 28)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.hashCode()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.equals(java.lang.Object)",
      "begin_line": 288,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 57)",
        "(line 298,col 9)-(line 300,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.asPath()",
      "begin_line": 303,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 320,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.namespaceIterator()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.namespacePointer(java.lang.String)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 343,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 57)"
      ]
    }
  ]
}