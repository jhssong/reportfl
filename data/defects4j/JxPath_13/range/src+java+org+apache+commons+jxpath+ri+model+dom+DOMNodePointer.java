{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 53,
      "end_line": 732,
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
      "begin_line": 190,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 42)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 241,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 294,
      "end_line": 298,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)",
        "(line 296,col 9)-(line 297,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 300,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 324,
      "end_line": 366,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 368,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 382,col 23)",
        "(line 383,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 400,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 60)",
        "(line 404,col 9)-(line 404,col 28)",
        "(line 405,col 9)-(line 405,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 408,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 41)",
        "(line 413,col 9)-(line 413,col 41)",
        "(line 414,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 50)",
        "(line 428,col 9)-(line 428,col 26)",
        "(line 429,col 9)-(line 429,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 432,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 43)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 440,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 445,col 49)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 504,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 41)",
        "(line 506,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 37)",
        "(line 514,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 524,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 22)",
        "(line 526,col 9)-(line 526,col 43)",
        "(line 527,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 539,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 22)",
        "(line 541,col 9)-(line 541,col 43)",
        "(line 542,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 551,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 22)",
        "(line 553,col 9)-(line 553,col 43)",
        "(line 554,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 564,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 22)",
        "(line 566,col 9)-(line 566,col 43)",
        "(line 567,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 585,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 41)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 41)",
        "(line 592,col 9)-(line 592,col 42)",
        "(line 593,col 9)-(line 593,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 596,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 47)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 41)",
        "(line 603,col 9)-(line 603,col 42)",
        "(line 604,col 9)-(line 604,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 607,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 41)",
        "(line 614,col 9)-(line 614,col 47)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 40)",
        "(line 620,col 9)-(line 620,col 68)",
        "(line 622,col 9)-(line 622,col 26)",
        "(line 623,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 635,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 643,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 42)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 85)",
        "(line 649,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 45)",
        "(line 658,col 9)-(line 658,col 48)",
        "(line 659,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 669,
      "end_line": 675,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 671,col 42)",
        "(line 672,col 9)-(line 672,col 54)",
        "(line 673,col 9)-(line 674,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 677,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 55)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 688,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 52)",
        "(line 692,col 9)-(line 692,col 52)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 37)",
        "(line 698,col 9)-(line 698,col 37)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 44)",
        "(line 721,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 17)"
      ]
    }
  ]
}