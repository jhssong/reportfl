{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 51,
      "end_line": 772,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localNamespaceResolver"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 65,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale, java.lang.String)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 28)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.Object)",
      "begin_line": 103,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceResolver()",
      "begin_line": 118,
      "end_line": 124,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceResolver()\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 126,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 52)",
        "(line 141,col 9)-(line 141,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 144,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 54)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getBaseValue()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isCollection()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLength()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf()",
      "begin_line": 215,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getName()",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getName()\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getImmediateNode()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getNode()\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue()",
      "begin_line": 251,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 29)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 106)",
        "(line 277,col 9)-(line 277,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 280,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(java.util.List)",
      "begin_line": 325,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 41)",
        "(line 327,col 9)-(line 327,col 35)",
        "(line 329,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 358,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 409,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 41)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 418,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 430,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 39)",
        "(line 447,col 9)-(line 447,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)",
      "begin_line": 454,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 468,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 488,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 502,col 23)",
        "(line 503,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 521,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 60)",
        "(line 525,col 9)-(line 525,col 28)",
        "(line 526,col 9)-(line 526,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 529,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 534,col 41)",
        "(line 535,col 9)-(line 535,col 41)",
        "(line 536,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 50)",
        "(line 555,col 9)-(line 555,col 26)",
        "(line 556,col 9)-(line 556,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 559,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 567,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 49)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(java.lang.String)",
      "begin_line": 628,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 41)",
        "(line 630,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 37)",
        "(line 638,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName()",
      "begin_line": 648,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 673,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 53)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 22)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 22)",
        "(line 686,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 698,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 23)",
        "(line 700,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 44)",
        "(line 710,col 9)-(line 710,col 22)",
        "(line 711,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 723,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 78)",
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 44)",
        "(line 729,col 9)-(line 729,col 22)",
        "(line 730,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 749,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 758,col 9)-(line 758,col 57)",
        "(line 759,col 9)-(line 759,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 762,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 55)",
        "(line 764,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 23)"
      ]
    }
  ]
}