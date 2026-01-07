{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/ResizableDoubleArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResizableDoubleArray",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.DoubleArray",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 896,
      "comment": "\n * \u003cp\u003e\n * A variable length {@link DoubleArray} implementation that automatically\n * handles expanding and contracting its internal storage array as elements\n * are added and removed.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  The internal storage array starts with capacity determined by the\n * \u003ccode\u003einitialCapacity\u003c/code\u003e property, which can be set by the constructor.\n * The default initial capacity is 16.  Adding elements using\n * {@link #addElement(double)} appends elements to the end of the array.  When\n * there are no open entries at the end of the internal storage array, the\n * array is expanded.  The size of the expanded array depends on the\n * \u003ccode\u003eexpansionMode\u003c/code\u003e and \u003ccode\u003eexpansionFactor\u003c/code\u003e properties.\n * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the size of the array is\n * multiplied by the \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if\n * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is\n * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * is 2.0.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link #addElementRolling(double)} method adds a new element to the end\n * of the internal storage array and adjusts the \"usable window\" of the\n * internal array forward by one position (effectively making what was the\n * second element the first, and so on).  Repeated activations of this method\n * (or activation of {@link #discardFrontElements(int)}) will effectively orphan\n * the storage locations at the beginning of the internal storage array.  To\n * reclaim this storage, each time one of these methods is activated, the size\n * of the internal storage array is compared to the number of addressable\n * elements (the \u003ccode\u003enumElements\u003c/code\u003e property) and if the difference\n * is too large, the internal array is contracted to size\n * \u003ccode\u003enumElements + 1.\u003c/code\u003e  The determination of when the internal\n * storage array is \"too large\" depends on the \u003ccode\u003eexpansionMode\u003c/code\u003e and\n * \u003ccode\u003econtractionFactor\u003c/code\u003e properties.  If  the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e, contraction is triggered when the\n * ratio between storage array length and \u003ccode\u003enumElements\u003c/code\u003e exceeds\n * \u003ccode\u003econtractionFactor.\u003c/code\u003e  If the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eADDITIVE_MODE,\u003c/code\u003e the number of excess storage locations\n * is compared to \u003ccode\u003econtractionFactor.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * To avoid cycles of expansions and contractions, the\n * \u003ccode\u003eexpansionFactor\u003c/code\u003e must not exceed the\n * \u003ccode\u003econtractionFactor.\u003c/code\u003e Constructors and mutators for both of these\n * properties enforce this requirement, throwing IllegalArgumentException if it\n * is violated.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n "
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
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "contractionCriteria"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The contraction criteria determines when the internal array will be\n     * contracted to fit the number of elements contained in the element\n     *  array + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionFactor"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * The expansion factor of the array.  When the array needs to be expanded,\n     * the new array size will be\n     * \u003ccode\u003einternalArray.length * expansionFactor\u003c/code\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE, or\n     * \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e if\n     * \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionMode"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Determines whether array expansion by \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is additive or multiplicative.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialCapacity"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The initial capacity of the array.  Initial capacity is not exposed as a\n     * property as it is only meaningful when passed to a constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalArray"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numElements"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * The number of addressable elements in the array.  Note that this\n     * has nothing to do with the length of the internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Create a ResizableArray with default properties.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003d 16\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * Create a ResizableArray with the specified initial capacity.  Other\n     * properties take default values:\n      * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @throws IllegalArgumentException if initialCapacity is not \u003e 0\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float)",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initial capacity\n     * and expansion factor.  The remaining properties take default\n     * values:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 0.5 + expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 47)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float)",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initialCapacity,\n     * expansionFactor, and contractionCriteria. The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * will default to \u003ccode\u003eMULTIPLICATIVE_MODE.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @param contractionCriteria The contraction Criteria.\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 214,col 44)",
        "(line 215,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float, int)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified properties.\u003c/p\u003e\n    * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode in {MULTIPLICATIVE_MODE, ADDITIVE_MODE}\u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param initialCapacity the initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @param contractionCriteria the contraction Criteria\n     * @param expansionMode  the expansion mode\n     * @throws IllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 47)",
        "(line 242,col 9)-(line 242,col 52)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.ResizableDoubleArray(org.apache.commons.math.util.ResizableDoubleArray)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Copy constructor.  Creates a new ResizableDoubleArray that is a deep,\n     * fresh copy of the original. Needs to acquire synchronization lock\n     * on original.  Original may not be null; otherwise a NullPointerException\n     * is thrown.\n     *\n     * @param original array to copy\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.addElement(double)",
      "begin_line": 266,
      "end_line": 275,
      "comment": "\n     * Adds an element to the end of this expandable array.\n     *\n     * @param value to be added to end of array\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 22)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 62)",
        "(line 272,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.addElementRolling(double)",
      "begin_line": 293,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003e\n     * Adds an element to the end of the array and removes the first\n     * element in the array.  Returns the discarded first element.\n     * The effect is similar to a push operation in a FIFO queue.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)\n     * and addElementRolling(5) is invoked, the result is an array containing\n     * the entries 2, 3, 4, 5 and the value returned is 1.\n     * \u003c/p\u003e\n     *\n     * @param value the value to be added to the array\n     * @return the value which has been discarded or \"pushed\" out of the array\n     *         by this rolling insert\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 53)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 24)",
        "(line 303,col 9)-(line 303,col 62)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.substituteMostRecentElement(double)",
      "begin_line": 321,
      "end_line": 332,
      "comment": "\n     * Substitutes \u003ccode\u003evalue\u003c/code\u003e for the most recently added value.\n     * Returns the value that has been replaced. If the array is empty (i.e.\n     * if {@link #numElements} is zero), a MathRuntimeException is thrown.\n     *\n     * @param value new value to substitute for the most recently added value\n     * @return value that has been replaced in the array\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 73)",
        "(line 329,col 9)-(line 329,col 62)",
        "(line 331,col 9)-(line 331,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.checkContractExpand(float, float)",
      "begin_line": 345,
      "end_line": 368,
      "comment": "\n     * Checks the expansion factor and the contraction criteria and throws an\n     * IllegalArgumentException if the contractionCriteria is less than the\n     * expansionCriteria\n     *\n     * @param expansion factor to be checked\n     * @param contraction criteria to be checked\n     * @throws IllegalArgumentException if the contractionCriteria is less than\n     *         the expansionCriteria.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.clear()",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * Clear the array, reset the size to the initialCapacity and the number\n     * of elements to zero.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 24)",
        "(line 376,col 9)-(line 376,col 23)",
        "(line 377,col 9)-(line 377,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.contract()",
      "begin_line": 385,
      "end_line": 394,
      "comment": "\n     * Contracts the storage array to the (size of the element set) + 1 - to\n     * avoid a zero length array. This function also resets the startIndex to\n     * zero.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 57)",
        "(line 389,col 9)-(line 389,col 79)",
        "(line 390,col 9)-(line 390,col 34)",
        "(line 393,col 9)-(line 393,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.discardFrontElements(int)",
      "begin_line": 407,
      "end_line": 411,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003ccode\u003e initial elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardFrontElements(2)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front of the array\n     * @throws IllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.discardMostRecentElements(int)",
      "begin_line": 424,
      "end_line": 428,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003ccode\u003e last elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardMostRecentElements(2)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the end of the array\n     * @throws IllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.discardExtremeElements(int, boolean)",
      "begin_line": 449,
      "end_line": 466,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003ccode\u003e first or last elements of the array,\n     * depending on the value of \u003ccode\u003efront\u003c/code\u003e.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,false)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,true)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.\n     * Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front/end of the array\n     * @param front true if elements are to be discarded from the front\n     * of the array, false if elements are to be discarded from the end\n     * of the array\n     * @throws IllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.expand()",
      "begin_line": 477,
      "end_line": 495,
      "comment": "\n     * Expands the internal storage array using the expansion factor.\n     * \u003cp\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE,\n     * the new array size will be \u003ccode\u003einternalArray.length * expansionFactor.\u003c/code\u003e\n     * If \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE,  the length\n     * after expansion will be \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 24)",
        "(line 485,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 49)",
        "(line 493,col 9)-(line 493,col 79)",
        "(line 494,col 9)-(line 494,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.expandTo(int)",
      "begin_line": 502,
      "end_line": 507,
      "comment": "\n     * Expands the internal storage array to the specified size.\n     *\n     * @param size Size of the new internal storage array\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 46)",
        "(line 505,col 9)-(line 505,col 79)",
        "(line 506,col 9)-(line 506,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getContractionCriteria()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * The contraction criteria defines when the internal array will contract\n     * to store only the number of elements in the element array.\n     * If  the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e,\n     * contraction is triggered when the ratio between storage array length\n     * and \u003ccode\u003enumElements\u003c/code\u003e exceeds \u003ccode\u003econtractionFactor\u003c/code\u003e.\n     * If the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eADDITIVE_MODE\u003c/code\u003e, the\n     * number of excess storage locations is compared to\n     * \u003ccode\u003econtractionFactor.\u003c/code\u003e\n     *\n     * @return the contraction criteria used to reclaim memory.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getElement(int)",
      "begin_line": 533,
      "end_line": 545,
      "comment": "\n     * Returns the element at the specified index\n     *\n     * @param index index to fetch a value from\n     * @return value stored at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero or is greater than \u003ccode\u003egetNumElements() - 1\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getElements()",
      "begin_line": 554,
      "end_line": 559,
      "comment": "\n     * Returns a double array containing the elements of this\n     * \u003ccode\u003eResizableArray\u003c/code\u003e.  This method returns a copy, not a\n     * reference to the underlying array, so that changes made to the returned\n     *  array have no effect on this \u003ccode\u003eResizableArray.\u003c/code\u003e\n     * @return the double array.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 56)",
        "(line 556,col 9)-(line 557,col 29)",
        "(line 558,col 9)-(line 558,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getExpansionFactor()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * The expansion factor controls the size of a new array when an array\n     * needs to be expanded.  The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * determines whether the size of the array is multiplied by the\n     * \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if\n     * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is\n     * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is 2.0.\n     *\n     * @return the expansion factor of this expandable double array\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getExpansionMode()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the internal storage\n     * array grows additively (ADDITIVE_MODE) or multiplicatively\n     * (MULTIPLICATIVE_MODE) when it is expanded.\n     *\n     * @return Returns the expansionMode.\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getInternalLength()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Notice the package scope on this method.   This method is simply here\n     * for the JUnit test, it allows us check if the expansion is working\n     * properly after a number of expansions.  This is not meant to be a part\n     * of the public interface of this class.\n     *\n     * @return the length of the internal storage array.\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getNumElements()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Returns the number of elements currently in the array.  Please note\n     * that this is different from the length of the internal storage array.\n     *\n     * @return number of elements\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getValues()",
      "begin_line": 622,
      "end_line": 625,
      "comment": "\n     * Returns the internal storage array.  Note that this method returns\n     * a reference to the internal storage array, not a copy, and to correctly\n     * address elements of the array, the \u003ccode\u003estartIndex\u003c/code\u003e is\n     * required (available via the {@link #start} method).  This method should\n     * only be used in cases where copying the internal array is not practical.\n     * The {@link #getElements} method should be used in all other cases.\n     *\n     *\n     * @return the internal storage array used by this object\n     * @deprecated replaced by {@link #getInternalValues()} as of 2.0\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.getInternalValues()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\n     * Returns the internal storage array.  Note that this method returns\n     * a reference to the internal storage array, not a copy, and to correctly\n     * address elements of the array, the \u003ccode\u003estartIndex\u003c/code\u003e is\n     * required (available via the {@link #start} method).  This method should\n     * only be used in cases where copying the internal array is not practical.\n     * The {@link #getElements} method should be used in all other cases.\n     *\n     *\n     * @return the internal storage array used by this object\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setContractionCriteria(float)",
      "begin_line": 648,
      "end_line": 653,
      "comment": "\n     * Sets the contraction criteria for this ExpandContractDoubleArray.\n     *\n     * @param contractionCriteria contraction criteria\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 71)",
        "(line 650,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setElement(int, double)",
      "begin_line": 668,
      "end_line": 681,
      "comment": "\n     * Sets the element at the specified index.  If the specified index is greater than\n     * \u003ccode\u003egetNumElements() - 1\u003c/code\u003e, the \u003ccode\u003enumElements\u003c/code\u003e property\n     * is increased to \u003ccode\u003eindex +1\u003c/code\u003e and additional storage is allocated\n     * (if necessary) for the new element and all  (uninitialized) elements\n     * between the new element and the previous end of the array).\n     *\n     * @param index index to store a value in\n     * @param value value to store at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setExpansionFactor(float)",
      "begin_line": 694,
      "end_line": 700,
      "comment": "\n     * Sets the expansionFactor.  Throws IllegalArgumentException if the\n     * the following conditions are not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param expansionFactor the new expansion factor value.\n     * @throws IllegalArgumentException if expansionFactor is \u003c\u003d 1 or greater\n     * than contractionFactor\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 71)",
        "(line 697,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setExpansionMode(int)",
      "begin_line": 709,
      "end_line": 720,
      "comment": "\n     * Sets the \u003ccode\u003eexpansionMode\u003c/code\u003e. The specified value must be one of\n     * ADDITIVE_MODE, MULTIPLICATIVE_MODE.\n     *\n     * @param expansionMode The expansionMode to set.\n     * @throws IllegalArgumentException if the specified mode value is not valid\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setInitialCapacity(int)",
      "begin_line": 729,
      "end_line": 739,
      "comment": "\n     * Sets the initial capacity.  Should only be invoked by constructors.\n     *\n     * @param initialCapacity of the array\n     * @throws IllegalArgumentException if \u003ccode\u003einitialCapacity\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 738,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.setNumElements(int)",
      "begin_line": 749,
      "end_line": 766,
      "comment": "\n     * This function allows you to control the number of elements contained\n     * in this array, and can be used to \"throw out\" the last n values in an\n     * array. This function will also expand the internal array as needed.\n     *\n     * @param i a new number of elements\n     * @throws IllegalArgumentException if \u003ccode\u003ei\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 756,col 9)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 765,col 9)-(line 765,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.shouldContract()",
      "begin_line": 774,
      "end_line": 780,
      "comment": "\n     * Returns true if the internal storage array has too many unused\n     * storage positions.\n     *\n     * @return true if array satisfies the contraction criteria\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 779,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.start()",
      "begin_line": 791,
      "end_line": 793,
      "comment": "\n     * Returns the starting index of the internal array.  The starting index is\n     * the position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     *\n     * @return starting index\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.copy(org.apache.commons.math.util.ResizableDoubleArray, org.apache.commons.math.util.ResizableDoubleArray)",
      "begin_line": 811,
      "end_line": 825,
      "comment": "\n     * \u003cp\u003eCopies source to dest, copying the underlying data, so dest is\n     * a new, independent copy of source.  Does not contract before\n     * the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eObtains synchronization locks on both source and dest\n     * (in that order) before performing the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eNeither source nor dest may be null; otherwise a NullPointerException\n     * is thrown\u003c/p\u003e\n     *\n     * @param source ResizableDoubleArray to copy\n     * @param dest ResizableArray to replace with a copy of the source array\n     * @since 2.0\n     *\n     ",
      "child_ranges": [
        "(line 812,col 8)-(line 824,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.copy()",
      "begin_line": 835,
      "end_line": 839,
      "comment": "\n     * Returns a copy of the ResizableDoubleArray.  Does not contract before\n     * the copy, so the returned object is an exact copy of this.\n     *\n     * @return a new ResizableDoubleArray with the same data and configuration\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 65)",
        "(line 837,col 9)-(line 837,col 27)",
        "(line 838,col 9)-(line 838,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.equals(java.lang.Object)",
      "begin_line": 850,
      "end_line": 875,
      "comment": "\n     * Returns true iff object is a ResizableDoubleArray with the same properties\n     * as this and an identical internal storage array.\n     *\n     * @param object object to be compared for equality with this\n     * @return true iff object is a ResizableDoubleArray with the same data and\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 854,col 9)",
        "(line 855,col 8)-(line 857,col 9)",
        "(line 858,col 8)-(line 874,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ResizableDoubleArray.hashCode()",
      "begin_line": 883,
      "end_line": 894,
      "comment": "\n     * Returns a hash code consistent with equals.\n     *\n     * @return hash code representing this ResizableDoubleArray\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 36)",
        "(line 886,col 9)-(line 886,col 60)",
        "(line 887,col 9)-(line 887,col 64)",
        "(line 888,col 9)-(line 888,col 36)",
        "(line 889,col 13)-(line 889,col 57)",
        "(line 890,col 13)-(line 890,col 42)",
        "(line 891,col 13)-(line 891,col 38)",
        "(line 892,col 13)-(line 892,col 37)",
        "(line 893,col 9)-(line 893,col 41)"
      ]
    }
  ]
}