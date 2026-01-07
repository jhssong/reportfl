{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/util/ResizableDoubleArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResizableDoubleArray",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.DoubleArray",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 691,
      "comment": "\n * \u003cp\u003e\n * A variable length {@link DoubleArray} implementation that automatically \n * handles expanding and contracting its internal storage array as elements \n * are added and removed.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  The internal storage array starts with capacity determined by the\n * \u003ccode\u003einitialCapacity\u003c/code\u003e property, which can be set by the constructor.\n * The default initial capacity is 16.  Adding elements using \n * {@link #addElement(double)} appends elements to the end of the array.  When \n * there are no open entries at the end of the internal storage array, the \n * array is expanded.  The size of the expanded array depends on the \n * \u003ccode\u003eexpansionMode\u003c/code\u003e and \u003ccode\u003eexpansionFactor\u003c/code\u003e properties.  \n * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the size of the array is \n * multiplied by the \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if \n * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is \n * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * is 2.0.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link #addElementRolling(double)} method adds a new element to the end\n * of the internal storage array and adjusts the \"usable window\" of the \n * internal array forward by one position (effectively making what was the \n * second element the first, and so on).  Repeated activations of this method\n * (or activation of {@link #discardFrontElements(int)}) will effectively orphan\n * the storage locations at the beginning of the internal storage array.  To\n * reclaim this storage, each time one of these methods is activated, the size\n * of the internal storage array is compared to the number of addressable \n * elements (the \u003ccode\u003enumElements\u003c/code\u003e property) and if the difference\n * is too large, the internal array is contracted to size \n * \u003ccode\u003enumElements + 1.\u003c/code\u003e  The determination of when the internal\n * storage array is \"too large\" depends on the \u003ccode\u003eexpansionMode\u003c/code\u003e and\n * \u003ccode\u003econtractionFactor\u003c/code\u003e properties.  If  the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e, contraction is triggered when the\n * ratio between storage array length and \u003ccode\u003enumElements\u003c/code\u003e exceeds\n * \u003ccode\u003econtractionFactor.\u003c/code\u003e  If the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eADDITIVE_MODE,\u003c/code\u003e the number of excess storage locations\n * is compared to \u003ccode\u003econtractionFactor.\u003c/code\u003e  \n * \u003c/p\u003e\n * \u003cp\u003e\n * To avoid cycles of expansions and contractions, the \n * \u003ccode\u003eexpansionFactor\u003c/code\u003e must not exceed the \n * \u003ccode\u003econtractionFactor.\u003c/code\u003e Constructors and mutators for both of these\n * properties enforce this requirement, throwing IllegalArgumentException if it\n * is violated.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "ADDITIVE_MODE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " additive expansion mode "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLICATIVE_MODE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " multiplicative expansion mode "
    },
    {
      "type": "field",
      "varNames": [
        "contractionCriteria"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " \n     * The contraction criteria determines when the internal array will be \n     * contracted to fit the number of elements contained in the element\n     *  array + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionFactor"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " \n     * The expansion factor of the array.  When the array needs to be expanded, \n     * the new array size will be \n     * \u003ccode\u003einternalArray.length * expansionFactor\u003c/code\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE, or\n     * \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e if \n     * \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionMode"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Determines whether array expansion by \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is additive or multiplicative.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialCapacity"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * The initial capacity of the array.  Initial capacity is not exposed as a\n     * property as it is only meaningful when passed to a constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalArray"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " \n     * The internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numElements"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " \n     * The number of addressable elements in the array.  Note that this\n     * has nothing to do with the length of the internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " \n     * The position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Create a ResizableArray with default properties.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003d 16\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Create a ResizableArray with the specified initial capacity.  Other\n     * properties take default values:\n      * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @throws IllegalArgumentException if initialCapacity is not \u003e 0\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 156,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float)",
      "begin_line": 181,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initial capacity \n     * and expansion factor.  The remaining properties take default\n     * values:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 0.5 + expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this \n     *                        parameter\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)",
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 185,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float)",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initialCapacity, \n     * expansionFactor, and contractionCriteria. The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * will default to \u003ccode\u003eMULTIPLICATIVE_MODE.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this \n     *                        parameter\n     * @param contractionCriteria The contraction Criteria.\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float, int)",
      "begin_line": 236,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified properties.\u003c/p\u003e\n    * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode in {MULTIPLICATIVE_MODE, ADDITIVE_MODE}\u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param initialCapacity the initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this \n     *                        parameter\n     * @param contractionCriteria the contraction Criteria\n     * @param expansionMode  the expansion mode\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 52)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.addElement(double)",
      "begin_line": 250,
      "end_line": 259,
      "comment": "\n     * Adds an element to the end of this expandable array.\n     * \n     * @param value to be added to end of array\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 22)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 62)",
        "(line 256,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.addElementRolling(double)",
      "begin_line": 277,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003e\n     * Adds an element to the end of the array and removes the first\n     * element in the array.  Returns the discarded first element.\n     * The effect is similar to a push operation in a FIFO queue.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)\n     * and addElementRolling(5) is invoked, the result is an array containing\n     * the entries 2, 3, 4, 5 and the value returned is 1.\n     * \u003c/p\u003e\n     * \n     * @param value the value to be added to the array\n     * @return the value which has been discarded or \"pushed\" out of the array\n     *         by this rolling insert\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 53)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 24)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.checkContractExpand(float, float)",
      "begin_line": 306,
      "end_line": 335,
      "comment": "\n     * Checks the expansion factor and the contraction criteria and throws an \n     * IllegalArgumentException if the contractionCriteria is less than the \n     * expansionCriteria\n     * \n     * @param expansionFactor factor to be checked\n     * @param contractionCritera critera to be checked\n     * @throws IllegalArgumentException if the contractionCriteria is less than\n     *         the expansionCriteria.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.clear()",
      "begin_line": 341,
      "end_line": 344,
      "comment": "\n     * Clear the array, reset the size to the initialCapacity and the number \n     * of elements to zero.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 24)",
        "(line 343,col 9)-(line 343,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.contract()",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n     * Contracts the storage array to the (size of the element set) + 1 - to \n     * avoid a zero length array. This function also resets the startIndex to \n     * zero. \n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 57)",
        "(line 355,col 9)-(line 355,col 79)",
        "(line 356,col 9)-(line 356,col 34)",
        "(line 359,col 9)-(line 359,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.discardFrontElements(int)",
      "begin_line": 372,
      "end_line": 388,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003ccode\u003e initial elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking \n     * \u003ccode\u003ediscardFrontElements(2)\u003c/code\u003e will cause the first two elements \n     * to be discarded, leaving 3,4 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     * \n     * @param i  the number of elements to discard from the front of the array\n     * @throws IllegalArgumentException if i is greater than numElements.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.expand()",
      "begin_line": 399,
      "end_line": 417,
      "comment": "\n     * Expands the internal storage array using the expansion factor.\n     * \u003cp\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE,\n     * the new array size will be \u003ccode\u003einternalArray.length * expansionFactor.\u003c/code\u003e\n     * If \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE,  the length\n     * after expansion will be \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 24)",
        "(line 407,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 49)",
        "(line 415,col 9)-(line 415,col 79)",
        "(line 416,col 9)-(line 416,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.expandTo(int)",
      "begin_line": 424,
      "end_line": 429,
      "comment": "\n     * Expands the internal storage array to the specified size.\n     * \n     * @param size Size of the new internal storage array\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 46)",
        "(line 427,col 9)-(line 427,col 79)",
        "(line 428,col 9)-(line 428,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getContractionCriteria()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * The contraction criteria defines when the internal array will contract \n     * to store only the number of elements in the element array.   \n     * If  the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e,\n     * contraction is triggered when the ratio between storage array length \n     * and \u003ccode\u003enumElements\u003c/code\u003e exceeds \u003ccode\u003econtractionFactor\u003c/code\u003e.\n     * If the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eADDITIVE_MODE\u003c/code\u003e, the\n     * number of excess storage locations is compared to \n     * \u003ccode\u003econtractionFactor.\u003c/code\u003e   \n     * \n     * @return the contraction criteria used to reclaim memory.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getElement(int)",
      "begin_line": 455,
      "end_line": 468,
      "comment": "\n     * Returns the element at the specified index\n     * \n     * @param index index to fetch a value from\n     * @return value stored at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero or is greater than \u003ccode\u003egetNumElements() - 1\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getElements()",
      "begin_line": 477,
      "end_line": 482,
      "comment": "\n     * Returns a double array containing the elements of this \n     * \u003ccode\u003eResizableArray\u003c/code\u003e.  This method returns a copy, not a\n     * reference to the underlying array, so that changes made to the returned\n     *  array have no effect on this \u003ccode\u003eResizableArray.\u003c/code\u003e\n     * @return the double array.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 56)",
        "(line 479,col 9)-(line 480,col 29)",
        "(line 481,col 9)-(line 481,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getExpansionFactor()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * The expansion factor controls the size of a new aray when an array \n     * needs to be expanded.  The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * determines whether the size of the array is multiplied by the \n     * \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if \n     * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is \n     * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is 2.0.\n     * \n     * @return the expansion factor of this expandable double array\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getExpansionMode()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the internal storage \n     * array grows additively (ADDITIVE_MODE) or multiplicatively \n     * (MULTIPLICATIVE_MODE) when it is expanded.\n     * \n     * @return Returns the expansionMode.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getInternalLength()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Notice the package scope on this method.   This method is simply here \n     * for the JUnit test, it allows us check if the expansion is working \n     * properly after a number of expansions.  This is not meant to be a part \n     * of the public interface of this class.\n     * \n     * @return the length of the internal storage array.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getNumElements()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Returns the number of elements currently in the array.  Please note\n     * that this is different from the length of the internal storage array.  \n     *\n     * @return number of elements\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getValues()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Returns the internal storage array.  Note that this method returns\n     * a reference to the internal storage array, not a copy, and to correctly\n     * address elements of the array, the \u003ccode\u003estartIndex\u003c/code\u003e is\n     * required (available via the {@link #start} method).  This method should\n     * only be used in cases where copying the internal array is not practical.\n     * The {@link #getElements} method should be used in all other cases.\n     *\n     * \n     * @return the internal storage array used by this object\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setContractionCriteria(float)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * Sets the contraction criteria for this ExpandContractDoubleArray. \n     * \n     * @param contractionCriteria contraction criteria\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 71)",
        "(line 555,col 9)-(line 555,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setElement(int, double)",
      "begin_line": 571,
      "end_line": 583,
      "comment": "\n     * Sets the element at the specified index.  If the specified index is greater than\n     * \u003ccode\u003egetNumElements() - 1\u003c/code\u003e, the \u003ccode\u003enumElements\u003c/code\u003e property\n     * is increased to \u003ccode\u003eindex +1\u003c/code\u003e and additional storage is allocated \n     * (if necessary) for the new element and all  (uninitialized) elements \n     * between the new element and the previous end of the array).\n     * \n     * @param index index to store a value in\n     * @param value value to store at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setExpansionFactor(float)",
      "begin_line": 596,
      "end_line": 600,
      "comment": "\n     * Sets the expansionFactor.  Throws IllegalArgumentException if the \n     * the following conditions are not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param expansionFactor the new expansion factor value.\n     * @throws IllegalArgumentException if expansionFactor is \u003c\u003d 1 or greater\n     * than contractionFactor\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 71)",
        "(line 599,col 9)-(line 599,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setExpansionMode(int)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n     * Sets the \u003ccode\u003eexpansionMode\u003c/code\u003e. The specified value must be one of\n     * ADDITIVE_MODE, MULTIPLICATIVE_MODE.\n     * \n     * @param expansionMode The expansionMode to set.\n     * @throws IllegalArgumentException if the specified mode value is not valid\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setInitialCapacity(int)",
      "begin_line": 624,
      "end_line": 635,
      "comment": "\n     * Sets the initial capacity.  Should only be invoked by constructors.\n     * \n     * @param initialCapacity of the array\n     * @throws IllegalArgumentException if \u003ccode\u003einitialCapacity\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setNumElements(int)",
      "begin_line": 645,
      "end_line": 662,
      "comment": "\n     * This function allows you to control the number of elements contained \n     * in this array, and can be used to \"throw out\" the last n values in an \n     * array. This function will also expand the internal array as needed.\n     * \n     * @param i a new number of elements\n     * @throws IllegalArgumentException if \u003ccode\u003ei\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 652,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 661,col 9)-(line 661,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.shouldContract()",
      "begin_line": 670,
      "end_line": 676,
      "comment": "\n     * Returns true if the internal storage array has too many unused \n     * storage positions.  \n     * \n     * @return true if array satisfies the contraction criteria\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.start()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Returns the starting index of the internal array.  The starting index is\n     * the position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     *\n     * @return starting index\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 26)"
      ]
    }
  ]
}