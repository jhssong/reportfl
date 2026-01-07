{
  "filepath": "/tmp/JxPath-9b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 53,
      "end_line": 728,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultNamespace"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale, java.lang.String)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.w3c.dom.Node)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 87,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 144,col 9)-(line 144,col 41)",
        "(line 145,col 9)-(line 145,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 148,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 25)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 166,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 186,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 42)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 237,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 39)",
        "(line 292,col 9)-(line 293,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 296,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 320,
      "end_line": 362,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 364,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 378,col 23)",
        "(line 379,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 393,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 396,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 60)",
        "(line 400,col 9)-(line 400,col 28)",
        "(line 401,col 9)-(line 401,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 404,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 50)",
        "(line 424,col 9)-(line 424,col 26)",
        "(line 425,col 9)-(line 425,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 428,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 43)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 436,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 49)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 500,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 41)",
        "(line 502,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 37)",
        "(line 510,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 520,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 22)",
        "(line 522,col 9)-(line 522,col 43)",
        "(line 523,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 535,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 22)",
        "(line 537,col 9)-(line 537,col 43)",
        "(line 538,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 547,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 22)",
        "(line 549,col 9)-(line 549,col 43)",
        "(line 550,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 560,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 22)",
        "(line 562,col 9)-(line 562,col 43)",
        "(line 563,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 581,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 41)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 41)",
        "(line 588,col 9)-(line 588,col 42)",
        "(line 589,col 9)-(line 589,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 592,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 41)",
        "(line 599,col 9)-(line 599,col 42)",
        "(line 600,col 9)-(line 600,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 603,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 41)",
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 40)",
        "(line 616,col 9)-(line 616,col 68)",
        "(line 618,col 9)-(line 618,col 26)",
        "(line 619,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 631,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 639,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 42)",
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 85)",
        "(line 645,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 45)",
        "(line 654,col 9)-(line 654,col 48)",
        "(line 655,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 665,
      "end_line": 671,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 667,col 42)",
        "(line 668,col 9)-(line 668,col 54)",
        "(line 669,col 9)-(line 670,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 673,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 55)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 684,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 52)",
        "(line 688,col 9)-(line 688,col 52)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 693,col 9)-(line 693,col 37)",
        "(line 694,col 9)-(line 694,col 37)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 44)",
        "(line 717,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 17)"
      ]
    }
  ]
}