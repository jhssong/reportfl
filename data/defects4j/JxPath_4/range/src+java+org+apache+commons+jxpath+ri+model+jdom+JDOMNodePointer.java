{
  "filepath": "/tmp/JxPath-4b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 50,
      "end_line": 756,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale, java.lang.String)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 28)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 22)",
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 77,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.Object)",
      "begin_line": 101,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 113,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 131,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 47)",
        "(line 136,col 9)-(line 136,col 47)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 172,col 9)-(line 172,col 37)",
        "(line 173,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getBaseValue()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isCollection()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLength()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf()",
      "begin_line": 202,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getName()",
      "begin_line": 215,
      "end_line": 229,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getName()\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 217,col 25)",
        "(line 218,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getImmediateNode()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getNode()\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue()",
      "begin_line": 238,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 265,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(java.util.List)",
      "begin_line": 310,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 41)",
        "(line 312,col 9)-(line 312,col 35)",
        "(line 314,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 343,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 394,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 399,col 41)",
        "(line 400,col 9)-(line 400,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 403,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 415,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 39)",
        "(line 432,col 9)-(line 432,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 435,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 24)",
        "(line 437,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 451,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 471,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 485,col 23)",
        "(line 486,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 505,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 28)",
        "(line 510,col 9)-(line 510,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 513,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 41)",
        "(line 519,col 9)-(line 519,col 41)",
        "(line 520,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 50)",
        "(line 538,col 9)-(line 538,col 26)",
        "(line 539,col 9)-(line 539,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 542,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 42)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 550,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 49)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(java.lang.String)",
      "begin_line": 612,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 41)",
        "(line 614,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 37)",
        "(line 622,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName()",
      "begin_line": 632,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 657,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 53)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 22)",
        "(line 663,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 22)",
        "(line 670,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 682,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 23)",
        "(line 684,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 44)",
        "(line 694,col 9)-(line 694,col 22)",
        "(line 695,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 707,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 78)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 44)",
        "(line 713,col 9)-(line 713,col 22)",
        "(line 714,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 729,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 733,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 736,col 9)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 742,col 9)-(line 742,col 57)",
        "(line 743,col 9)-(line 743,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 746,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 55)",
        "(line 748,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 23)"
      ]
    }
  ]
}