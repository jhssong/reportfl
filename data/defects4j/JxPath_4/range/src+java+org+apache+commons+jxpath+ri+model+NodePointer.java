{
  "filepath": "/tmp/JxPath-4b/src/java/org/apache/commons/jxpath/ri/model/NodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 42,
      "end_line": 706,
      "comment": "\n * Common superclass for Pointers of all kinds.  A NodePointer maps to\n * a deterministic XPath that represents the location of a node in an \n * object graph. This XPath uses only simple axes: child, namespace and\n * attribute and only simple, context-independent predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WHOLE_COLLECTION"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAMESPACE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 55,
      "end_line": 77,
      "comment": "\n     * Allocates an entirely new NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 67,col 65)",
        "(line 68,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 83,
      "end_line": 100,
      "comment": "\n     * Allocates an new child NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 65)",
        "(line 90,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)",
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceResolver()",
      "begin_line": 115,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "setNamespaceResolver(NamespaceResolver)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NamespaceResolver\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getParent()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateParentPointer()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setAttribute(boolean)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Set to true if the pointer represents the \"attribute::\" axis.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isAttribute()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Returns true if the pointer represents the \"attribute::\" axis.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isRoot()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns true if this Pointer has no parent.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLeaf()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * If true, this node does not have children\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isNode()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * @deprecated Please use !isContainer()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isContainer()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * If true, this node is axiliary and can only be used as an intermediate in\n     * the chain of pointers.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getIndex()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * If the pointer represents a collection, the index identifies\n     * an element of that collection.  The default value of \u003ccode\u003eindex\u003c/code\u003e\n     * is \u003ccode\u003eWHOLE_COLLECTION\u003c/code\u003e, which just means that the pointer\n     * is not indexed at all.\n     * Note: the index on NodePointer starts with 0, not 1.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setIndex(int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isCollection()",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the value of the pointer is an array or\n     * a Collection.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLength()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * If the pointer represents a collection (or collection element),\n     * returns the length of the collection.\n     * Otherwise returns 1 (even if the value is null).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValue()",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * By default, returns \u003ccode\u003egetNode()\u003c/code\u003e, can be overridden to\n     * return a \"canonical\" value, like for instance a DOM element should\n     * return its string value.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 53)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * If this pointer manages a transparent container, like a variable,\n     * this method returns the pointer to the contents.\n     * Only an auxiliary (non-node) pointer can (and should) return a\n     * value pointer other than itself.\n     * Note that you probably don\u0027t want to override \n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e directly.  Override the\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e method instead.  The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method is calls\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e and, if the result is not\n     * \u003ccode\u003ethis\u003c/code\u003e, invokes \u003ccode\u003egetValuePointer()\u003c/code\u003e recursively.\n     * The idea here is to open all nested containers. Let\u0027s say we have a\n     * container within a container within a container. The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method should then open all those\n     * containers and return the pointer to the ultimate contents. It does so\n     * with the above recursion.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateValuePointer()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * @see #getValuePointer()\n     * \n     * @return NodePointer is either \u003ccode\u003ethis\u003c/code\u003e or a pointer\n     *   for the immediately contained value.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isActual()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * An actual pointer points to an existing part of an object graph, even\n     * if it is null. A non-actual pointer represents a part that does not exist\n     * at all.\n     * For instance consider the pointer \"/address/street\".\n     * If both \u003cem\u003eaddress\u003c/em\u003e and \u003cem\u003estreet\u003c/em\u003e are not null,\n     * the pointer is actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is not null, but \u003cem\u003estreet\u003c/em\u003e is null,\n     * the pointer is still actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is null, the pointer is not actual.\n     * (In JavaBeans) if \u003cem\u003eaddress\u003c/em\u003e is not a property of the root bean,\n     * a Pointer for this path cannot be obtained at all - actual or otherwise.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getName()",
      "begin_line": 273,
      "end_line": 273,
      "comment": "\n     * Returns the name of this node. Can be null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getBaseValue()",
      "begin_line": 280,
      "end_line": 280,
      "comment": "\n     * Returns the value represented by the pointer before indexing.\n     * So, if the node represents an element of a collection, this\n     * method returns the collection itself.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeValue()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     *\n     * @deprecated 1.1 Please use getNode()\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNode()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type. Opens containers, properties etc and returns\n     * the ultimate contents.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getRootNode()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateNode()",
      "begin_line": 312,
      "end_line": 312,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setValue(java.lang.Object)",
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * Converts the value to the required type and changes the corresponding\n     * object to that value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 324,
      "end_line": 325,
      "comment": "\n     * Compares two child NodePointers and returns a positive number,\n     * zero or a positive number according to the order of the pointers.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 330,
      "end_line": 361,
      "comment": "\n     * Checks if this Pointer matches the supplied NodeTest.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 360,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\n     *  Called directly by JXPathContext. Must create path and\n     *  set value.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 24)",
        "(line 373,col 9)-(line 373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.remove()",
      "begin_line": 379,
      "end_line": 384,
      "comment": "\n     * Remove the node of the object graph this pointer points to.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object.\n     * Must create an object described by this pointer and return\n     * a new pointer that properly describes the new object.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 401,
      "end_line": 410,
      "comment": "\n     * Called by a child pointer if that child needs to assign the value\n     * supplied in the createPath(context, value) call to a non-existent\n     * node. This method may have to expand the collection in order to assign\n     * the element.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 418,
      "end_line": 423,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object for a\n     * non-existent collection element. It may have to expand the collection,\n     * then create an element object and return a new pointer describing the\n     * newly created element.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "\n     * Called to create a non-existing attribute\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLocale()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "\n     * If the Pointer has a parent, returns the parent\u0027s locale; otherwise\n     * returns the locale specified when this Pointer was created.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(java.lang.String)",
      "begin_line": 451,
      "end_line": 455,
      "comment": "\n     * Returns true if the selected locale name starts\n     * with the specified prefix \u003ci\u003elang\u003c/i\u003e, case-insensitive.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 33)",
        "(line 453,col 9)-(line 453,col 55)",
        "(line 454,col 9)-(line 454,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 482,
      "end_line": 490,
      "comment": "\n     * Returns a NodeIterator that iterates over all children or all children\n     * that match the given NodeTest, starting with the specified one.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 53)",
        "(line 488,col 9)-(line 489,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\n     * Returns a NodeIterator that iterates over all attributes of the current\n     * node matching the supplied node name (could have a wildcard).\n     * May return null if the object does not support the attributes.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 53)",
        "(line 499,col 9)-(line 500,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespaceIterator()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Returns a NodeIterator that iterates over all namespaces of the value\n     * currently pointed at.\n     * May return null if the object does not support the namespaces.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespacePointer(java.lang.String)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Returns a NodePointer for the specified namespace. Will return null\n     * if namespaces are not supported.\n     * Will return UNKNOWN_NAMESPACE if there is no such namespace.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Decodes a namespace prefix to the corresponding URI.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Returns the namespace URI associated with this Pointer.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isDefaultNamespace(java.lang.String)",
      "begin_line": 539,
      "end_line": 546,
      "comment": "\n     * Returns true if the supplied prefix represents the\n     * default namespace in the context of the current node.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 544,col 9)-(line 544,col 51)",
        "(line 545,col 9)-(line 545,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getDefaultNamespaceURI()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 562,
      "end_line": 568,
      "comment": "\n     * Locates a node by key and value.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.asPath()",
      "begin_line": 573,
      "end_line": 598,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 580,col 9)-(line 580,col 49)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 33)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.clone()",
      "begin_line": 600,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.toString()",
      "begin_line": 615,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareTo(java.lang.Object)",
      "begin_line": 619,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 51)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 627,col 9)-(line 627,col 23)",
        "(line 628,col 9)-(line 628,col 30)",
        "(line 629,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 23)",
        "(line 634,col 9)-(line 634,col 33)",
        "(line 635,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, int, org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 642,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 82)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printPointerChain()",
      "begin_line": 680,
      "end_line": 682,
      "comment": "\n     * Print internal structure of a pointer for debugging\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printDeep(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 684,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 704,col 9)"
      ]
    }
  ]
}