{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/VariablePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariablePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 37,
      "end_line": 436,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.VariablePointer(org.apache.commons.jxpath.Variables, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Create a new VariablePointer.\n     * @param variables Variables instance\n     * @param name variable name\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)",
        "(line 50,col 9)-(line 50,col 35)",
        "(line 51,col 9)-(line 51,col 25)",
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.VariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Create a new (non-actual) VariablePointer.\n     * @param name variable name\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)",
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isContainer()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getName()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getBaseValue()",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isLeaf()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isCollection()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getImmediateNode()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)",
        "(line 110,col 9)-(line 111,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.setValue(java.lang.Object)",
      "begin_line": 117,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 28)",
        "(line 122,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.isActual()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.setIndex(int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 30)",
        "(line 143,col 9)-(line 143,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getImmediateValuePointer()",
      "begin_line": 149,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.Anonymous-76495fc7-016e-4d87-bee1-ade24dd3ed47.getImmediateNode()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 25)-(line 161,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getLength()",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 190,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 196,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 213,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 241,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 61)",
        "(line 247,col 9)-(line 247,col 54)",
        "(line 248,col 9)-(line 248,col 47)",
        "(line 249,col 9)-(line 249,col 27)",
        "(line 250,col 9)-(line 250,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.createCollection(org.apache.commons.jxpath.JXPathContext, int)",
      "begin_line": 259,
      "end_line": 285,
      "comment": "\n     * Create a collection.\n     * @param context JXPathContext\n     * @param index collection index\n     * @return Object\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 28)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.remove()",
      "begin_line": 290,
      "end_line": 308,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.findVariables(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 314,
      "end_line": 326,
      "comment": "\n     * Assimilate the Variables instance associated with the specified context.\n     * @param context JXPathContext to search\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 28)",
        "(line 316,col 9)-(line 316,col 39)",
        "(line 317,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.hashCode()",
      "begin_line": 331,
      "end_line": 335,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.equals(java.lang.Object)",
      "begin_line": 340,
      "end_line": 353,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 57)",
        "(line 350,col 9)-(line 352,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.asPath()",
      "begin_line": 358,
      "end_line": 373,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 49)",
        "(line 360,col 9)-(line 360,col 27)",
        "(line 361,col 9)-(line 361,col 28)",
        "(line 362,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 378,
      "end_line": 383,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.namespaceIterator()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.namespacePointer(java.lang.String)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 418,
      "end_line": 426,
      "comment": "\n     * Find the AbstractFactory, if any, associated with the specified context.\n     * @param context JXPathContext to search\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 55)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 431,
      "end_line": 435,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 57)"
      ]
    }
  ]
}