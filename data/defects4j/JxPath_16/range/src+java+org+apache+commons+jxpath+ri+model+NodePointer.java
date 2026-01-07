{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/model/NodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 44,
      "end_line": 796,
      "comment": "\n * Common superclass for Pointers of all kinds.  A NodePointer maps to\n * a deterministic XPath that represents the location of a node in an\n * object graph. This XPath uses only simple axes: child, namespace and\n * attribute and only simple, context-independent predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WHOLE_COLLECTION"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Whole collection index. "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAMESPACE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Constant to indicate unknown namespace "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Index for this NodePointer "
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 62,
      "end_line": 84,
      "comment": "\n     * Allocates an entirely new NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 74,col 65)",
        "(line 75,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 90,
      "end_line": 107,
      "comment": "\n     * Allocates an new child NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 65)",
        "(line 97,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 29)",
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceResolver()",
      "begin_line": 122,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "setNamespaceResolver(NamespaceResolver)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NamespaceResolver\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getParent()",
      "begin_line": 133,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 37)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateParentPointer()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setAttribute(boolean)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Set to true if the pointer represents the \"attribute::\" axis.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isAttribute()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns true if the pointer represents the \"attribute::\" axis.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isRoot()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns true if this Pointer has no parent.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLeaf()",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * If true, this node does not have children\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isNode()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * @deprecated Please use !isContainer()\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isContainer()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * If true, this node is axiliary and can only be used as an intermediate in\n     * the chain of pointers.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getIndex()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * If the pointer represents a collection, the index identifies\n     * an element of that collection.  The default value of \u003ccode\u003eindex\u003c/code\u003e\n     * is \u003ccode\u003eWHOLE_COLLECTION\u003c/code\u003e, which just means that the pointer\n     * is not indexed at all.\n     * Note: the index on NodePointer starts with 0, not 1.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setIndex(int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isCollection()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the value of the pointer is an array or\n     * a Collection.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLength()",
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n     * If the pointer represents a collection (or collection element),\n     * returns the length of the collection.\n     * Otherwise returns 1 (even if the value is null).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValue()",
      "begin_line": 219,
      "end_line": 226,
      "comment": "\n     * By default, returns \u003ccode\u003egetNode()\u003c/code\u003e, can be overridden to\n     * return a \"canonical\" value, like for instance a DOM element should\n     * return its string value.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 53)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * If this pointer manages a transparent container, like a variable,\n     * this method returns the pointer to the contents.\n     * Only an auxiliary (non-node) pointer can (and should) return a\n     * value pointer other than itself.\n     * Note that you probably don\u0027t want to override\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e directly.  Override the\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e method instead.  The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method is calls\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e and, if the result is not\n     * \u003ccode\u003ethis\u003c/code\u003e, invokes \u003ccode\u003egetValuePointer()\u003c/code\u003e recursively.\n     * The idea here is to open all nested containers. Let\u0027s say we have a\n     * container within a container within a container. The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method should then open all those\n     * containers and return the pointer to the ultimate contents. It does so\n     * with the above recursion.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 53)",
        "(line 247,col 9)-(line 247,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateValuePointer()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * @see #getValuePointer()\n     *\n     * @return NodePointer is either \u003ccode\u003ethis\u003c/code\u003e or a pointer\n     *   for the immediately contained value.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isActual()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * An actual pointer points to an existing part of an object graph, even\n     * if it is null. A non-actual pointer represents a part that does not exist\n     * at all.\n     * For instance consider the pointer \"/address/street\".\n     * If both \u003cem\u003eaddress\u003c/em\u003e and \u003cem\u003estreet\u003c/em\u003e are not null,\n     * the pointer is actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is not null, but \u003cem\u003estreet\u003c/em\u003e is null,\n     * the pointer is still actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is null, the pointer is not actual.\n     * (In JavaBeans) if \u003cem\u003eaddress\u003c/em\u003e is not a property of the root bean,\n     * a Pointer for this path cannot be obtained at all - actual or otherwise.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getName()",
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n     * Returns the name of this node. Can be null.\n     * @return QName\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getBaseValue()",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Returns the value represented by the pointer before indexing.\n     * So, if the node represents an element of a collection, this\n     * method returns the collection itself.\n     * @return Object value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeValue()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node value\n     * @deprecated 1.1 Please use getNode()\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNode()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type. Opens containers, properties etc and returns\n     * the ultimate contents.\n     * @return Object node\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getRootNode()",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * Get the root node.\n     * @return Object value of this pointer\u0027s root (top parent).\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateNode()",
      "begin_line": 327,
      "end_line": 327,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setValue(java.lang.Object)",
      "begin_line": 334,
      "end_line": 334,
      "comment": "\n     * Converts the value to the required type and changes the corresponding\n     * object to that value.\n     * @param value the value to set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 343,
      "end_line": 344,
      "comment": "\n     * Compares two child NodePointers and returns a positive number,\n     * zero or a positive number according to the order of the pointers.\n     * @param pointer1 first pointer to be compared\n     * @param pointer2 second pointer to be compared\n     * @return int per Java comparison conventions\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 351,
      "end_line": 382,
      "comment": "\n     * Checks if this Pointer matches the supplied NodeTest.\n     * @param test the NodeTest to execute\n     * @return true if a match\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 381,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Compare two strings, either of which may be null, for equality.\n     * @param s1 the first String to compare\n     * @param s2 the second String to compare\n     * @return true if both Strings are null, same or equal\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n     *  Called directly by JXPathContext. Must create path and\n     *  set value.\n     *  @param context the owning JXPathContext\n     *  @param value the new value to set\n     *  @return created NodePointer\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 24)",
        "(line 403,col 9)-(line 403,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.remove()",
      "begin_line": 409,
      "end_line": 414,
      "comment": "\n     * Remove the node of the object graph this pointer points to.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object.\n     * Must create an object described by this pointer and return\n     * a new pointer that properly describes the new object.\n     * @param context the owning JXPathContext\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 438,
      "end_line": 447,
      "comment": "\n     * Called by a child pointer if that child needs to assign the value\n     * supplied in the createPath(context, value) call to a non-existent\n     * node. This method may have to expand the collection in order to assign\n     * the element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @param value node value to set\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 459,
      "end_line": 464,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object for a\n     * non-existent collection element. It may have to expand the collection,\n     * then create an element object and return a new pointer describing the\n     * newly created element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 472,
      "end_line": 476,
      "comment": "\n     * Called to create a non-existing attribute\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which an attribute should be created\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLocale()",
      "begin_line": 483,
      "end_line": 490,
      "comment": "\n     * If the Pointer has a parent, returns the parent\u0027s locale; otherwise\n     * returns the locale specified when this Pointer was created.\n     * @return Locale for this NodePointer\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(java.lang.String)",
      "begin_line": 498,
      "end_line": 502,
      "comment": "\n     * Check whether our locale matches the specified language.\n     * @param lang String language to check\n     * @return true if the selected locale name starts\n     *              with the specified prefix \u003ci\u003elang\u003c/i\u003e, case-insensitive.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 33)",
        "(line 500,col 9)-(line 500,col 55)",
        "(line 501,col 9)-(line 501,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 512,
      "end_line": 520,
      "comment": "\n     * Returns a NodeIterator that iterates over all children or all children\n     * that match the given NodeTest, starting with the specified one.\n     * @param test NodeTest to filter children\n     * @param reverse specified iteration direction\n     * @param startWith the NodePointer to start with\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 53)",
        "(line 518,col 9)-(line 519,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 529,
      "end_line": 533,
      "comment": "\n     * Returns a NodeIterator that iterates over all attributes of the current\n     * node matching the supplied node name (could have a wildcard).\n     * May return null if the object does not support the attributes.\n     * @param qname the attribute name to test\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 53)",
        "(line 531,col 9)-(line 532,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespaceIterator()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Returns a NodeIterator that iterates over all namespaces of the value\n     * currently pointed at.\n     * May return null if the object does not support the namespaces.\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespacePointer(java.lang.String)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * Returns a NodePointer for the specified namespace. Will return null\n     * if namespaces are not supported.\n     * Will return UNKNOWN_NAMESPACE if there is no such namespace.\n     * @param namespace incoming namespace\n     * @return NodePointer for \u003ccode\u003enamespace\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Decodes a namespace prefix to the corresponding URI.\n     * @param prefix prefix to decode\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * Returns the namespace URI associated with this Pointer.\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isDefaultNamespace(java.lang.String)",
      "begin_line": 579,
      "end_line": 586,
      "comment": "\n     * Returns true if the supplied prefix represents the\n     * default namespace in the context of the current node.\n     * @param prefix the prefix to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if prefix is default\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 584,col 51)",
        "(line 585,col 9)-(line 585,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getDefaultNamespaceURI()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n     * Get the default ns uri\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Locates a node by ID.\n     * @param context JXPathContext owning context\n     * @param id String id\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 613,
      "end_line": 619,
      "comment": "\n     * Locates a node by key and value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Find a NodeSet by key/value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return NodeSet found\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.asPath()",
      "begin_line": 636,
      "end_line": 661,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     * @return String xpath expression\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 49)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 648,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 33)",
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 660,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.clone()",
      "begin_line": 667,
      "end_line": 680,
      "comment": "\n     * Clone this NodePointer.\n     * @return cloned NodePointer\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.toString()",
      "begin_line": 685,
      "end_line": 687,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareTo(java.lang.Object)",
      "begin_line": 692,
      "end_line": 725,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 51)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 703,col 9)-(line 703,col 23)",
        "(line 704,col 9)-(line 704,col 30)",
        "(line 705,col 9)-(line 705,col 41)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 42)",
        "(line 714,col 9)-(line 714,col 23)",
        "(line 715,col 9)-(line 715,col 33)",
        "(line 716,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 724,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, int, org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 735,
      "end_line": 760,
      "comment": "\n     * Compare node pointers.\n     * @param p1 pointer 1\n     * @param depth1 depth 1\n     * @param p2 pointer 2\n     * @param depth2 depth 2\n     * @return comparison result: (\u003c 0) -\u003e (p1 lt p2); (0) -\u003e (p1 eq p2); (\u003e 0) -\u003e (p1 gt p2)\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 82)",
        "(line 759,col 9)-(line 759,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printPointerChain()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * Print internal structure of a pointer for debugging\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printDeep(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 774,
      "end_line": 795,
      "comment": "\n     * Print deep\n     * @param pointer to print\n     * @param indent indentation level\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 794,col 9)"
      ]
    }
  ]
}