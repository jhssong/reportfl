{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/model/NodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 46,
      "end_line": 917,
      "comment": "\n * Common superclass for Pointers of all kinds.  A NodePointer maps to\n * a deterministic XPath that represents the location of a node in an\n * object graph. This XPath uses only simple axes: child, namespace and\n * attribute and only simple, context-independent predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "WHOLE_COLLECTION"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Whole collection index. "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAMESPACE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Constant to indicate unknown namespace "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Index for this NodePointer "
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exceptionHandler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 73,
      "end_line": 94,
      "comment": "\n     * Allocates an entirely new NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param name QName\n     * @param bean Object\n     * @param locale Locale\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 84,col 65)",
        "(line 85,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 104,
      "end_line": 120,
      "comment": "\n     * Allocates an new child NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param parent pointer\n     * @param name QName\n     * @param bean Object\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Parent pointer "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Locale "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 29)",
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceResolver()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * Get the NamespaceResolver associated with this NodePointer.\n     * @return NamespaceResolver\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "setNamespaceResolver(NamespaceResolver)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NamespaceResolver\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Set the NamespaceResolver for this NodePointer.\n     * @param namespaceResolver NamespaceResolver\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getParent()",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Get the parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateParentPointer()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Get the immediate parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setAttribute(boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Set to true if the pointer represents the \"attribute::\" axis.\n     * @param attribute boolean\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isAttribute()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns true if the pointer represents the \"attribute::\" axis.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isRoot()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns true if this Pointer has no parent.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLeaf()",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * If true, this node does not have children\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isNode()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Learn whether this pointer is considered to be a node.\n     * @return boolean\n     * @deprecated Please use !isContainer()\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isContainer()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * If true, this node is auxiliary and can only be used as an intermediate in\n     * the chain of pointers.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getIndex()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * If the pointer represents a collection, the index identifies\n     * an element of that collection.  The default value of \u003ccode\u003eindex\u003c/code\u003e\n     * is \u003ccode\u003eWHOLE_COLLECTION\u003c/code\u003e, which just means that the pointer\n     * is not indexed at all.\n     * Note: the index on NodePointer starts with 0, not 1.\n     * @return int\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setIndex(int)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Set the index of this NodePointer.\n     * @param index int\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isCollection()",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the value of the pointer is an array or\n     * a Collection.\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLength()",
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n     * If the pointer represents a collection (or collection element),\n     * returns the length of the collection.\n     * Otherwise returns 1 (even if the value is null).\n     * @return int\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValue()",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n     * By default, returns \u003ccode\u003egetNode()\u003c/code\u003e, can be overridden to\n     * return a \"canonical\" value, like for instance a DOM element should\n     * return its string value.\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 53)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * If this pointer manages a transparent container, like a variable,\n     * this method returns the pointer to the contents.\n     * Only an auxiliary (non-node) pointer can (and should) return a\n     * value pointer other than itself.\n     * Note that you probably don\u0027t want to override\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e directly.  Override the\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e method instead.  The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method is calls\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e and, if the result is not\n     * \u003ccode\u003ethis\u003c/code\u003e, invokes \u003ccode\u003egetValuePointer()\u003c/code\u003e recursively.\n     * The idea here is to open all nested containers. Let\u0027s say we have a\n     * container within a container within a container. The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method should then open all those\n     * containers and return the pointer to the ultimate contents. It does so\n     * with the above recursion.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 53)",
        "(line 303,col 9)-(line 303,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateValuePointer()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * @see #getValuePointer()\n     *\n     * @return NodePointer is either \u003ccode\u003ethis\u003c/code\u003e or a pointer\n     *   for the immediately contained value.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isActual()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * An actual pointer points to an existing part of an object graph, even\n     * if it is null. A non-actual pointer represents a part that does not exist\n     * at all.\n     * For instance consider the pointer \"/address/street\".\n     * If both \u003cem\u003eaddress\u003c/em\u003e and \u003cem\u003estreet\u003c/em\u003e are not null,\n     * the pointer is actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is not null, but \u003cem\u003estreet\u003c/em\u003e is null,\n     * the pointer is still actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is null, the pointer is not actual.\n     * (In JavaBeans) if \u003cem\u003eaddress\u003c/em\u003e is not a property of the root bean,\n     * a Pointer for this path cannot be obtained at all - actual or otherwise.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getName()",
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n     * Returns the name of this node. Can be null.\n     * @return QName\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getBaseValue()",
      "begin_line": 346,
      "end_line": 346,
      "comment": "\n     * Returns the value represented by the pointer before indexing.\n     * So, if the node represents an element of a collection, this\n     * method returns the collection itself.\n     * @return Object value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeValue()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node value\n     * @deprecated 1.1 Please use getNode()\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNode()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type. Opens containers, properties etc and returns\n     * the ultimate contents.\n     * @return Object node\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getRootNode()",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * Get the root node.\n     * @return Object value of this pointer\u0027s root (top parent).\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateNode()",
      "begin_line": 384,
      "end_line": 384,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setValue(java.lang.Object)",
      "begin_line": 391,
      "end_line": 391,
      "comment": "\n     * Converts the value to the required type and changes the corresponding\n     * object to that value.\n     * @param value the value to set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 400,
      "end_line": 401,
      "comment": "\n     * Compares two child NodePointers and returns a positive number,\n     * zero or a positive number according to the order of the pointers.\n     * @param pointer1 first pointer to be compared\n     * @param pointer2 second pointer to be compared\n     * @return int per Java comparison conventions\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 408,
      "end_line": 439,
      "comment": "\n     * Checks if this Pointer matches the supplied NodeTest.\n     * @param test the NodeTest to execute\n     * @return true if a match\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 438,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n     *  Called directly by JXPathContext. Must create path and\n     *  set value.\n     *  @param context the owning JXPathContext\n     *  @param value the new value to set\n     *  @return created NodePointer\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 24)",
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.remove()",
      "begin_line": 456,
      "end_line": 461,
      "comment": "\n     * Remove the node of the object graph this pointer points to.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object.\n     * Must create an object described by this pointer and return\n     * a new pointer that properly describes the new object.\n     * @param context the owning JXPathContext\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 485,
      "end_line": 493,
      "comment": "\n     * Called by a child pointer if that child needs to assign the value\n     * supplied in the createPath(context, value) call to a non-existent\n     * node. This method may have to expand the collection in order to assign\n     * the element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @param value node value to set\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 505,
      "end_line": 509,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object for a\n     * non-existent collection element. It may have to expand the collection,\n     * then create an element object and return a new pointer describing the\n     * newly created element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 517,
      "end_line": 521,
      "comment": "\n     * Called to create a non-existing attribute\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which an attribute should be created\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLocale()",
      "begin_line": 528,
      "end_line": 533,
      "comment": "\n     * If the Pointer has a parent, returns the parent\u0027s locale; otherwise\n     * returns the locale specified when this Pointer was created.\n     * @return Locale for this NodePointer\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(java.lang.String)",
      "begin_line": 541,
      "end_line": 545,
      "comment": "\n     * Check whether our locale matches the specified language.\n     * @param lang String language to check\n     * @return true if the selected locale name starts\n     *              with the specified prefix \u003ci\u003elang\u003c/i\u003e, case-insensitive.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 33)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 555,
      "end_line": 562,
      "comment": "\n     * Returns a NodeIterator that iterates over all children or all children\n     * that match the given NodeTest, starting with the specified one.\n     * @param test NodeTest to filter children\n     * @param reverse specified iteration direction\n     * @param startWith the NodePointer to start with\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 53)",
        "(line 560,col 9)-(line 561,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 571,
      "end_line": 575,
      "comment": "\n     * Returns a NodeIterator that iterates over all attributes of the current\n     * node matching the supplied node name (could have a wildcard).\n     * May return null if the object does not support the attributes.\n     * @param qname the attribute name to test\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 53)",
        "(line 573,col 9)-(line 574,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespaceIterator()",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * Returns a NodeIterator that iterates over all namespaces of the value\n     * currently pointed at.\n     * May return null if the object does not support the namespaces.\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespacePointer(java.lang.String)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * Returns a NodePointer for the specified namespace. Will return null\n     * if namespaces are not supported.\n     * Will return UNKNOWN_NAMESPACE if there is no such namespace.\n     * @param namespace incoming namespace\n     * @return NodePointer for \u003ccode\u003enamespace\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Decodes a namespace prefix to the corresponding URI.\n     * @param prefix prefix to decode\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Returns the namespace URI associated with this Pointer.\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isDefaultNamespace(java.lang.String)",
      "begin_line": 621,
      "end_line": 628,
      "comment": "\n     * Returns true if the supplied prefix represents the\n     * default namespace in the context of the current node.\n     * @param prefix the prefix to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if prefix is default\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 626,col 51)",
        "(line 627,col 9)-(line 627,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getDefaultNamespaceURI()",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n     * Get the default ns uri\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\n     * Locates a node by ID.\n     * @param context JXPathContext owning context\n     * @param id String id\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 655,
      "end_line": 660,
      "comment": "\n     * Locates a node by key and value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Find a NodeSet by key/value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return NodeSet found\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.asPath()",
      "begin_line": 677,
      "end_line": 702,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     * @return String xpath expression\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 49)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 33)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.clone()",
      "begin_line": 708,
      "end_line": 721,
      "comment": "\n     * Clone this NodePointer.\n     * @return cloned NodePointer\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.toString()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareTo(java.lang.Object)",
      "begin_line": 727,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 51)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 738,col 9)-(line 738,col 23)",
        "(line 739,col 9)-(line 739,col 30)",
        "(line 740,col 9)-(line 740,col 41)",
        "(line 741,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 42)",
        "(line 749,col 9)-(line 749,col 23)",
        "(line 750,col 9)-(line 750,col 33)",
        "(line 751,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, int, org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 770,
      "end_line": 794,
      "comment": "\n     * Compare node pointers.\n     * @param p1 pointer 1\n     * @param depth1 depth 1\n     * @param p2 pointer 2\n     * @param depth2 depth 2\n     * @return comparison result: (\u003c 0) -\u003e (p1 lt p2); (0) -\u003e (p1 eq p2); (\u003e 0) -\u003e (p1 gt p2)\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 782,col 9)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 82)",
        "(line 793,col 9)-(line 793,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printPointerChain()",
      "begin_line": 799,
      "end_line": 801,
      "comment": "\n     * Print internal structure of a pointer for debugging\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setExceptionHandler(org.apache.commons.jxpath.ExceptionHandler)",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n     * Set the exceptionHandler of this NodePointer.\n     * @param exceptionHandler the ExceptionHandler to set\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.handle(java.lang.Throwable, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 817,
      "end_line": 825,
      "comment": "\n     * Handle a Throwable using an installed ExceptionHandler, if available.\n     * Public to facilitate calling for RI support; not truly intended for public consumption.\n     * @param t to handle\n     * @param originator context\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.handle(java.lang.Throwable)",
      "begin_line": 832,
      "end_line": 834,
      "comment": "\n     * Handle a Throwable using an installed ExceptionHandler, if available.\n     * Public to facilitate calling for RI support; not truly intended for public consumption.\n     * @param t to handle\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.escape(java.lang.String)",
      "begin_line": 841,
      "end_line": 869,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 50)",
        "(line 843,col 9)-(line 843,col 65)",
        "(line 844,col 9)-(line 844,col 31)",
        "(line 845,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 876,
      "end_line": 884,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 55)",
        "(line 878,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 883,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printDeep(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 891,
      "end_line": 912,
      "comment": "\n     * Print deep\n     * @param pointer to print\n     * @param indent indentation level\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.safeEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 55)"
      ]
    }
  ]
}