{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/utilities/AVLTree.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AVLTree",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 632,
      "comment": " This class implements AVL trees.\n *\n * \u003cp\u003eThe purpose of this class is to sort elements while allowing\n * duplicate elements (i.e. such that {@code a.equals(b)} is\n * true). The {@code SortedSet} interface does not allow this, so\n * a specific class is needed. Null elements are not allowed.\u003c/p\u003e\n *\n * \u003cp\u003eSince the {@code equals} method is not sufficient to\n * differentiate elements, the {@link #delete delete} method is\n * implemented using the equality operator.\u003c/p\u003e\n *\n * \u003cp\u003eIn order to clearly mark the methods provided here do not have\n * the same semantics as the ones specified in the\n * {@code SortedSet} interface, different names are used\n * ({@code add} has been replaced by {@link #insert insert} and\n * {@code remove} has been replaced by {@link #delete\n * delete}).\u003c/p\u003e\n *\n * \u003cp\u003eThis class is based on the C implementation Georg Kraml has put\n * in the public domain. Unfortunately, his \u003ca\n * href\u003d\"www.purists.org/georg/avltree/index.html\"\u003epage\u003c/a\u003e seems not\n * to exist any more.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the elements\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "top"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Top level node. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.AVLTree()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " Build an empty tree.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.insert(T)",
      "begin_line": 61,
      "end_line": 69,
      "comment": " Insert an element in the tree.\n     * @param element element to insert (silently ignored if null)\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.delete(T)",
      "begin_line": 81,
      "end_line": 97,
      "comment": " Delete an element from the tree.\n     * \u003cp\u003eThe element is deleted only if there is a node {@code n}\n     * containing exactly the element instance specified, i.e. for which\n     * {@code n.getElement() \u003d\u003d element}. This is purposely\n     * \u003cem\u003edifferent\u003c/em\u003e from the specification of the\n     * {@code java.util.Set} {@code remove} method (in fact,\n     * this is the reason why a specific class has been developed).\u003c/p\u003e\n     * @param element element to delete (silently ignored if null)\n     * @return true if the element was deleted from the tree\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.isEmpty()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Check if the tree is empty.\n     * @return true if the tree is empty\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.size()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " Get the number of elements of the tree.\n     * @return number of elements contained in the tree\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.getSmallest()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Get the node whose element is the smallest one in the tree.\n     * @return the tree node containing the smallest element in the tree\n     * or null if the tree is empty\n     * @see #getLargest\n     * @see #getNotSmaller\n     * @see #getNotLarger\n     * @see Node#getPrevious\n     * @see Node#getNext\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.getLargest()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " Get the node whose element is the largest one in the tree.\n     * @return the tree node containing the largest element in the tree\n     * or null if the tree is empty\n     * @see #getSmallest\n     * @see #getNotSmaller\n     * @see #getNotLarger\n     * @see Node#getPrevious\n     * @see Node#getNext\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.getNotSmaller(T)",
      "begin_line": 151,
      "end_line": 168,
      "comment": " Get the node whose element is not smaller than the reference object.\n     * @param reference reference object (may not be in the tree)\n     * @return the tree node containing the smallest element not smaller\n     * than the reference object or null if either the tree is empty or\n     * all its elements are smaller than the reference object\n     * @see #getSmallest\n     * @see #getLargest\n     * @see #getNotLarger\n     * @see Node#getPrevious\n     * @see Node#getNext\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.getNotLarger(T)",
      "begin_line": 182,
      "end_line": 199,
      "comment": " Get the node whose element is not larger than the reference object.\n     * @param reference reference object (may not be in the tree)\n     * @return the tree node containing the largest element not larger\n     * than the reference object (in which case the node is guaranteed\n     * not to be empty) or null if either the tree is empty or all its\n     * elements are larger than the reference object\n     * @see #getSmallest\n     * @see #getLargest\n     * @see #getNotSmaller\n     * @see Node#getPrevious\n     * @see Node#getNext\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)",
        "(line 184,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 224,
      "end_line": 630,
      "comment": " This class implements AVL trees nodes.\n     * \u003cp\u003eAVL tree nodes implement all the logical structure of the\n     * tree. Nodes are created by the {@link AVLTree AVLTree} class.\u003c/p\u003e\n     * \u003cp\u003eThe nodes are not independant from each other but must obey\n     * specific balancing constraints and the tree structure is\n     * rearranged as elements are inserted or deleted from the tree. The\n     * creation, modification and tree-related navigation methods have\n     * therefore restricted access. Only the order-related navigation,\n     * reading and delete methods are public.\u003c/p\u003e\n     * @see AVLTree\n     "
    },
    {
      "type": "field",
      "varNames": [
        "element"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " Element contained in the current node. "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " Left sub-tree. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Right sub-tree. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Parent tree. "
    },
    {
      "type": "field",
      "varNames": [
        "skew"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Skew factor. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.Node(T, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node)",
      "begin_line": 245,
      "end_line": 251,
      "comment": " Build a node for a specified element.\n         * @param element element\n         * @param parent parent node\n         ",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 35)",
        "(line 247,col 13)-(line 247,col 32)",
        "(line 248,col 13)-(line 248,col 32)",
        "(line 249,col 13)-(line 249,col 34)",
        "(line 250,col 13)-(line 250,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.getElement()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Get the contained element.\n         * @return element contained in the node\n         ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.size()",
      "begin_line": 263,
      "end_line": 265,
      "comment": " Get the number of elements of the tree rooted at this node.\n         * @return number of elements contained in the tree rooted at this node\n         ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.getSmallest()",
      "begin_line": 273,
      "end_line": 279,
      "comment": " Get the node whose element is the smallest one in the tree\n         * rooted at this node.\n         * @return the tree node containing the smallest element in the\n         * tree rooted at this node or null if the tree is empty\n         * @see #getLargest\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 29)",
        "(line 275,col 13)-(line 277,col 13)",
        "(line 278,col 13)-(line 278,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.getLargest()",
      "begin_line": 287,
      "end_line": 293,
      "comment": " Get the node whose element is the largest one in the tree\n         * rooted at this node.\n         * @return the tree node containing the largest element in the\n         * tree rooted at this node or null if the tree is empty\n         * @see #getSmallest\n         ",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 29)",
        "(line 289,col 13)-(line 291,col 13)",
        "(line 292,col 13)-(line 292,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.getPrevious()",
      "begin_line": 300,
      "end_line": 317,
      "comment": " Get the node containing the next smaller or equal element.\n         * @return node containing the next smaller or equal element or\n         * null if there is no smaller or equal element in the tree\n         * @see #getNext\n         ",
      "child_ranges": [
        "(line 302,col 13)-(line 307,col 13)",
        "(line 309,col 13)-(line 313,col 13)",
        "(line 315,col 13)-(line 315,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.getNext()",
      "begin_line": 325,
      "end_line": 342,
      "comment": " Get the node containing the next larger or equal element.\n         * @return node containing the next larger or equal element (in\n         * which case the node is guaranteed not to be empty) or null if\n         * there is no larger or equal element in the tree\n         * @see #getPrevious\n         ",
      "child_ranges": [
        "(line 327,col 13)-(line 332,col 13)",
        "(line 334,col 13)-(line 338,col 13)",
        "(line 340,col 13)-(line 340,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.insert(T)",
      "begin_line": 348,
      "end_line": 365,
      "comment": " Insert an element in a sub-tree.\n         * @param newElement element to insert\n         * @return true if the parent tree should be re-Skew.BALANCED\n         ",
      "child_ranges": [
        "(line 349,col 13)-(line 356,col 13)",
        "(line 359,col 13)-(line 362,col 13)",
        "(line 363,col 13)-(line 363,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.delete()",
      "begin_line": 369,
      "end_line": 410,
      "comment": " Delete the node from the tree.\n         ",
      "child_ranges": [
        "(line 370,col 13)-(line 409,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rebalanceLeftGrown()",
      "begin_line": 415,
      "end_line": 449,
      "comment": " Re-balance the instance as left sub-tree has grown.\n         * @return true if the parent tree should be reSkew.BALANCED too\n         ",
      "child_ranges": [
        "(line 416,col 13)-(line 448,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rebalanceRightGrown()",
      "begin_line": 454,
      "end_line": 488,
      "comment": " Re-balance the instance as right sub-tree has grown.\n         * @return true if the parent tree should be reSkew.BALANCED too\n         ",
      "child_ranges": [
        "(line 455,col 13)-(line 487,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rebalanceLeftShrunk()",
      "begin_line": 493,
      "end_line": 533,
      "comment": " Re-balance the instance as left sub-tree has shrunk.\n         * @return true if the parent tree should be reSkew.BALANCED too\n         ",
      "child_ranges": [
        "(line 494,col 13)-(line 532,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rebalanceRightShrunk()",
      "begin_line": 538,
      "end_line": 578,
      "comment": " Re-balance the instance as right sub-tree has shrunk.\n         * @return true if the parent tree should be reSkew.BALANCED too\n         ",
      "child_ranges": [
        "(line 539,col 13)-(line 577,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rotateCW()",
      "begin_line": 584,
      "end_line": 603,
      "comment": " Perform a clockwise rotation rooted at the instance.\n         * \u003cp\u003eThe skew factor are not updated by this method, they\n         * \u003cem\u003emust\u003c/em\u003e be updated by the caller\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 43)",
        "(line 587,col 13)-(line 587,col 48)",
        "(line 588,col 13)-(line 588,col 42)",
        "(line 590,col 13)-(line 590,col 40)",
        "(line 591,col 13)-(line 591,col 48)",
        "(line 592,col 13)-(line 592,col 49)",
        "(line 593,col 13)-(line 593,col 41)",
        "(line 594,col 13)-(line 594,col 43)",
        "(line 596,col 13)-(line 598,col 13)",
        "(line 599,col 13)-(line 601,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.rotateCCW()",
      "begin_line": 609,
      "end_line": 628,
      "comment": " Perform a counter-clockwise rotation rooted at the instance.\n         * \u003cp\u003eThe skew factor are not updated by this method, they\n         * \u003cem\u003emust\u003c/em\u003e be updated by the caller\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 611,col 13)-(line 611,col 44)",
        "(line 612,col 13)-(line 612,col 50)",
        "(line 613,col 13)-(line 613,col 43)",
        "(line 615,col 13)-(line 615,col 42)",
        "(line 616,col 13)-(line 616,col 50)",
        "(line 617,col 13)-(line 617,col 49)",
        "(line 618,col 13)-(line 618,col 41)",
        "(line 619,col 13)-(line 619,col 44)",
        "(line 621,col 13)-(line 623,col 13)",
        "(line 624,col 13)-(line 626,col 13)"
      ]
    }
  ]
}