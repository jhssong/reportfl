{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 50,
      "end_line": 768,
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
        "(line 141,col 9)-(line 162,col 9)",
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
        "(line 203,col 9)-(line 208,col 9)",
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
        "(line 239,col 9)-(line 261,col 9)",
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
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 397,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 412,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 424,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 439,
      "end_line": 445,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 39)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 447,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 24)",
        "(line 449,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 463,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 485,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 499,col 23)",
        "(line 500,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 60)",
        "(line 523,col 9)-(line 523,col 28)",
        "(line 524,col 9)-(line 524,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 527,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 532,col 41)",
        "(line 533,col 9)-(line 533,col 41)",
        "(line 534,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 50)",
        "(line 552,col 9)-(line 552,col 26)",
        "(line 553,col 9)-(line 553,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 556,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 42)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 564,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 569,col 49)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(java.lang.String)",
      "begin_line": 626,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 41)",
        "(line 628,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 37)",
        "(line 636,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName()",
      "begin_line": 646,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 671,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 53)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 22)",
        "(line 677,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 22)",
        "(line 684,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 696,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 23)",
        "(line 698,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 44)",
        "(line 708,col 9)-(line 708,col 22)",
        "(line 709,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 721,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 78)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 44)",
        "(line 727,col 9)-(line 727,col 22)",
        "(line 728,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 743,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 747,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 57)",
        "(line 757,col 9)-(line 757,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 759,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 55)",
        "(line 761,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 23)"
      ]
    }
  ]
}