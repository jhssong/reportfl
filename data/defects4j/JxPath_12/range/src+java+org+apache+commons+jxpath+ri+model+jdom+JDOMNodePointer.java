{
  "filepath": "/tmp/JxPath-12b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 50,
      "end_line": 758,
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
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 106)",
        "(line 264,col 9)-(line 264,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 267,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(java.util.List)",
      "begin_line": 312,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 41)",
        "(line 314,col 9)-(line 314,col 35)",
        "(line 316,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 345,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 396,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 41)",
        "(line 401,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 402,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 405,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 417,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 432,
      "end_line": 435,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 39)",
        "(line 434,col 9)-(line 434,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)",
      "begin_line": 441,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 455,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 475,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 489,col 23)",
        "(line 490,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 508,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 60)",
        "(line 512,col 9)-(line 512,col 28)",
        "(line 513,col 9)-(line 513,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 516,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 41)",
        "(line 522,col 9)-(line 522,col 41)",
        "(line 523,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 50)",
        "(line 541,col 9)-(line 541,col 26)",
        "(line 542,col 9)-(line 542,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 545,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 42)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 553,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 558,col 49)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(java.lang.String)",
      "begin_line": 614,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 41)",
        "(line 616,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 37)",
        "(line 624,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName()",
      "begin_line": 634,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 659,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 53)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 22)",
        "(line 665,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 22)",
        "(line 672,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 684,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 23)",
        "(line 686,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 44)",
        "(line 696,col 9)-(line 696,col 22)",
        "(line 697,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 709,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 78)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 44)",
        "(line 715,col 9)-(line 715,col 22)",
        "(line 716,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 735,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 57)",
        "(line 745,col 9)-(line 745,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 748,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 55)",
        "(line 750,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 23)"
      ]
    }
  ]
}