{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/util/ResizableDoubleArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResizableDoubleArray",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.DoubleArray",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 933,
      "comment": "\n * \u003cp\u003e\n * A variable length {@link DoubleArray} implementation that automatically\n * handles expanding and contracting its internal storage array as elements\n * are added and removed.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  The internal storage array starts with capacity determined by the\n * \u003ccode\u003einitialCapacity\u003c/code\u003e property, which can be set by the constructor.\n * The default initial capacity is 16.  Adding elements using\n * {@link #addElement(double)} appends elements to the end of the array.  When\n * there are no open entries at the end of the internal storage array, the\n * array is expanded.  The size of the expanded array depends on the\n * \u003ccode\u003eexpansionMode\u003c/code\u003e and \u003ccode\u003eexpansionFactor\u003c/code\u003e properties.\n * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the size of the array is\n * multiplied by the \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if\n * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is\n * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n * is 2.0.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link #addElementRolling(double)} method adds a new element to the end\n * of the internal storage array and adjusts the \"usable window\" of the\n * internal array forward by one position (effectively making what was the\n * second element the first, and so on).  Repeated activations of this method\n * (or activation of {@link #discardFrontElements(int)}) will effectively orphan\n * the storage locations at the beginning of the internal storage array.  To\n * reclaim this storage, each time one of these methods is activated, the size\n * of the internal storage array is compared to the number of addressable\n * elements (the \u003ccode\u003enumElements\u003c/code\u003e property) and if the difference\n * is too large, the internal array is contracted to size\n * \u003ccode\u003enumElements + 1.\u003c/code\u003e  The determination of when the internal\n * storage array is \"too large\" depends on the \u003ccode\u003eexpansionMode\u003c/code\u003e and\n * \u003ccode\u003econtractionFactor\u003c/code\u003e properties.  If  the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e, contraction is triggered when the\n * ratio between storage array length and \u003ccode\u003enumElements\u003c/code\u003e exceeds\n * \u003ccode\u003econtractionFactor.\u003c/code\u003e  If the \u003ccode\u003eexpansionMode\u003c/code\u003e\n * is \u003ccode\u003eADDITIVE_MODE,\u003c/code\u003e the number of excess storage locations\n * is compared to \u003ccode\u003econtractionFactor.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * To avoid cycles of expansions and contractions, the\n * \u003ccode\u003eexpansionFactor\u003c/code\u003e must not exceed the\n * \u003ccode\u003econtractionFactor.\u003c/code\u003e Constructors and mutators for both of these\n * properties enforce this requirement, throwing IllegalArgumentException if it\n * is violated.\n * \u003c/p\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADDITIVE_MODE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " additive expansion mode "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLICATIVE_MODE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " multiplicative expansion mode "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "contractionCriteria"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The contraction criteria determines when the internal array will be\n     * contracted to fit the number of elements contained in the element\n     *  array + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionFactor"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * The expansion factor of the array.  When the array needs to be expanded,\n     * the new array size will be\n     * \u003ccode\u003einternalArray.length * expansionFactor\u003c/code\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE, or\n     * \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e if\n     * \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionMode"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Determines whether array expansion by \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is additive or multiplicative.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialCapacity"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The initial capacity of the array.  Initial capacity is not exposed as a\n     * property as it is only meaningful when passed to a constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalArray"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * The internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numElements"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The number of addressable elements in the array.  Note that this\n     * has nothing to do with the length of the internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * The position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Create a ResizableArray with default properties.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003d 16\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Create a ResizableArray with the specified initial capacity.  Other\n     * properties take default values:\n      * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @throws MathIllegalArgumentException if initialCapacity is not \u003e 0\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 44)",
        "(line 163,col 9)-(line 163,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(double[])",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Create a ResizableArray from an existing double[] with the\n     * initial capacity and numElements corresponding to the size of\n     * the supplied double[] array. If the supplied array is null, a\n     * new empty array with the default initial capacity will be created.\n     * The input array is copied, not referenced.\n     * Other properties take default values:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003d 16\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003d 2.5\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 2.0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialArray initial array\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initial capacity\n     * and expansion factor.  The remaining properties take default\n     * values:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode \u003d MULTIPLICATIVE_MODE\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003d 0.5 + expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @throws MathIllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 44)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 220,col 9)-(line 220,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float)",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified initialCapacity,\n     * expansionFactor, and contractionCriteria. The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * will default to \u003ccode\u003eMULTIPLICATIVE_MODE.\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param initialCapacity The initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @param contractionCriteria The contraction Criteria.\n     * @throws MathIllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 47)",
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float, int)",
      "begin_line": 271,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified properties.\u003c/p\u003e\n    * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode in {MULTIPLICATIVE_MODE, ADDITIVE_MODE}\u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param initialCapacity the initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @param contractionCriteria the contraction Criteria\n     * @param expansionMode  the expansion mode\n     * @throws MathIllegalArgumentException if parameters are not valid\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 47)",
        "(line 274,col 9)-(line 274,col 52)",
        "(line 275,col 9)-(line 275,col 44)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(org.apache.commons.math3.util.ResizableDoubleArray)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * Copy constructor.  Creates a new ResizableDoubleArray that is a deep,\n     * fresh copy of the original. Needs to acquire synchronization lock\n     * on original.  Original may not be null; otherwise a {@link NullArgumentException}\n     * is thrown.\n     *\n     * @param original array to copy\n     * @exception NullArgumentException if original is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 41)",
        "(line 293,col 9)-(line 293,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElement(double)",
      "begin_line": 301,
      "end_line": 310,
      "comment": "\n     * Adds an element to the end of this expandable array.\n     *\n     * @param value to be added to end of array\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 22)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 62)",
        "(line 307,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElements(double[])",
      "begin_line": 318,
      "end_line": 325,
      "comment": "\n     * Adds several element to the end of this expandable array.\n     *\n     * @param values to be added to end of array\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 79)",
        "(line 320,col 9)-(line 320,col 79)",
        "(line 321,col 9)-(line 321,col 75)",
        "(line 322,col 9)-(line 322,col 34)",
        "(line 323,col 9)-(line 323,col 23)",
        "(line 324,col 9)-(line 324,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElementRolling(double)",
      "begin_line": 343,
      "end_line": 360,
      "comment": "\n     * \u003cp\u003e\n     * Adds an element to the end of the array and removes the first\n     * element in the array.  Returns the discarded first element.\n     * The effect is similar to a push operation in a FIFO queue.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)\n     * and addElementRolling(5) is invoked, the result is an array containing\n     * the entries 2, 3, 4, 5 and the value returned is 1.\n     * \u003c/p\u003e\n     *\n     * @param value the value to be added to the array\n     * @return the value which has been discarded or \"pushed\" out of the array\n     *         by this rolling insert\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 53)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 24)",
        "(line 353,col 9)-(line 353,col 62)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.substituteMostRecentElement(double)",
      "begin_line": 372,
      "end_line": 383,
      "comment": "\n     * Substitutes \u003ccode\u003evalue\u003c/code\u003e for the most recently added value.\n     * Returns the value that has been replaced. If the array is empty (i.e.\n     * if {@link #numElements} is zero), an IllegalStateException is thrown.\n     *\n     * @param value new value to substitute for the most recently added value\n     * @return value that has been replaced in the array\n     * @throws MathIllegalStateException if the array is empty\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 73)",
        "(line 380,col 9)-(line 380,col 62)",
        "(line 382,col 9)-(line 382,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.checkContractExpand(float, float)",
      "begin_line": 396,
      "end_line": 415,
      "comment": "\n     * Checks the expansion factor and the contraction criteria and throws an\n     * IllegalArgumentException if the contractionCriteria is less than the\n     * expansionCriteria\n     *\n     * @param expansion factor to be checked\n     * @param contraction criteria to be checked\n     * @throws MathIllegalArgumentException if the contractionCriteria is less than\n     *         the expansionCriteria.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.clear()",
      "begin_line": 421,
      "end_line": 425,
      "comment": "\n     * Clear the array, reset the size to the initialCapacity and the number\n     * of elements to zero.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 24)",
        "(line 423,col 9)-(line 423,col 23)",
        "(line 424,col 9)-(line 424,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.contract()",
      "begin_line": 432,
      "end_line": 441,
      "comment": "\n     * Contracts the storage array to the (size of the element set) + 1 - to\n     * avoid a zero length array. This function also resets the startIndex to\n     * zero.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 57)",
        "(line 436,col 9)-(line 436,col 79)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 440,col 9)-(line 440,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardFrontElements(int)",
      "begin_line": 454,
      "end_line": 458,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e initial elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardFrontElements(2)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardMostRecentElements(int)",
      "begin_line": 471,
      "end_line": 475,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e last elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardMostRecentElements(2)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the end of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardExtremeElements(int, boolean)",
      "begin_line": 496,
      "end_line": 515,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e first or last elements of the array,\n     * depending on the value of \u003ccode\u003efront\u003c/code\u003e.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,false)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,true)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.\n     * Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front/end of the array\n     * @param front true if elements are to be discarded from the front\n     * of the array, false if elements are to be discarded from the end\n     * of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.expand()",
      "begin_line": 526,
      "end_line": 544,
      "comment": "\n     * Expands the internal storage array using the expansion factor.\n     * \u003cp\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE,\n     * the new array size will be \u003ccode\u003einternalArray.length * expansionFactor.\u003c/code\u003e\n     * If \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE,  the length\n     * after expansion will be \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 24)",
        "(line 534,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 49)",
        "(line 542,col 9)-(line 542,col 79)",
        "(line 543,col 9)-(line 543,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.expandTo(int)",
      "begin_line": 551,
      "end_line": 556,
      "comment": "\n     * Expands the internal storage array to the specified size.\n     *\n     * @param size Size of the new internal storage array\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 46)",
        "(line 554,col 9)-(line 554,col 79)",
        "(line 555,col 9)-(line 555,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getContractionCriteria()",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * The contraction criteria defines when the internal array will contract\n     * to store only the number of elements in the element array.\n     * If  the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e,\n     * contraction is triggered when the ratio between storage array length\n     * and \u003ccode\u003enumElements\u003c/code\u003e exceeds \u003ccode\u003econtractionFactor\u003c/code\u003e.\n     * If the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eADDITIVE_MODE\u003c/code\u003e, the\n     * number of excess storage locations is compared to\n     * \u003ccode\u003econtractionFactor.\u003c/code\u003e\n     *\n     * @return the contraction criteria used to reclaim memory.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getElement(int)",
      "begin_line": 582,
      "end_line": 590,
      "comment": "\n     * Returns the element at the specified index\n     *\n     * @param index index to fetch a value from\n     * @return value stored at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero or is greater than \u003ccode\u003egetNumElements() - 1\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 589,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getElements()",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\n     * Returns a double array containing the elements of this\n     * \u003ccode\u003eResizableArray\u003c/code\u003e.  This method returns a copy, not a\n     * reference to the underlying array, so that changes made to the returned\n     *  array have no effect on this \u003ccode\u003eResizableArray.\u003c/code\u003e\n     * @return the double array.\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 56)",
        "(line 601,col 9)-(line 602,col 29)",
        "(line 603,col 9)-(line 603,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getExpansionFactor()",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * The expansion factor controls the size of a new array when an array\n     * needs to be expanded.  The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * determines whether the size of the array is multiplied by the\n     * \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if\n     * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is\n     * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is 2.0.\n     *\n     * @return the expansion factor of this expandable double array\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getExpansionMode()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\n     * The \u003ccode\u003eexpansionMode\u003c/code\u003e determines whether the internal storage\n     * array grows additively (ADDITIVE_MODE) or multiplicatively\n     * (MULTIPLICATIVE_MODE) when it is expanded.\n     *\n     * @return Returns the expansionMode.\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getInternalLength()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * Notice the package scope on this method.   This method is simply here\n     * for the JUnit test, it allows us check if the expansion is working\n     * properly after a number of expansions.  This is not meant to be a part\n     * of the public interface of this class.\n     *\n     * @return the length of the internal storage array.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getNumElements()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * Returns the number of elements currently in the array.  Please note\n     * that this is different from the length of the internal storage array.\n     *\n     * @return number of elements\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getInternalValues()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Returns the internal storage array.  Note that this method returns\n     * a reference to the internal storage array, not a copy, and to correctly\n     * address elements of the array, the \u003ccode\u003estartIndex\u003c/code\u003e is\n     * required (available via the {@link #start} method).  This method should\n     * only be used in cases where copying the internal array is not practical.\n     * The {@link #getElements} method should be used in all other cases.\n     *\n     *\n     * @return the internal storage array used by this object\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setContractionCriteria(float)",
      "begin_line": 678,
      "end_line": 683,
      "comment": "\n     * Sets the contraction criteria for this ExpandContractDoubleArray.\n     *\n     * @param contractionCriteria contraction criteria\n     * @throws MathIllegalArgumentException if the contractionCriteria is less than\n     *         the expansionCriteria.\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 71)",
        "(line 680,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setElement(int, double)",
      "begin_line": 698,
      "end_line": 709,
      "comment": "\n     * Sets the element at the specified index.  If the specified index is greater than\n     * \u003ccode\u003egetNumElements() - 1\u003c/code\u003e, the \u003ccode\u003enumElements\u003c/code\u003e property\n     * is increased to \u003ccode\u003eindex +1\u003c/code\u003e and additional storage is allocated\n     * (if necessary) for the new element and all  (uninitialized) elements\n     * between the new element and the previous end of the array).\n     *\n     * @param index index to store a value in\n     * @param value value to store at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero.\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setExpansionFactor(float)",
      "begin_line": 722,
      "end_line": 728,
      "comment": "\n     * Sets the expansionFactor.  Throws IllegalArgumentException if the\n     * the following conditions are not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param expansionFactor the new expansion factor value.\n     * @throws MathIllegalArgumentException if expansionFactor is \u003c\u003d 1 or greater\n     * than contractionFactor\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 71)",
        "(line 725,col 9)-(line 727,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setExpansionMode(int)",
      "begin_line": 737,
      "end_line": 748,
      "comment": "\n     * Sets the \u003ccode\u003eexpansionMode\u003c/code\u003e. The specified value must be one of\n     * ADDITIVE_MODE, MULTIPLICATIVE_MODE.\n     *\n     * @param expansionMode The expansionMode to set.\n     * @throws MathIllegalArgumentException if the specified mode value is not valid\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setInitialCapacity(int)",
      "begin_line": 757,
      "end_line": 767,
      "comment": "\n     * Sets the initial capacity.  Should only be invoked by constructors.\n     *\n     * @param initialCapacity of the array\n     * @throws MathIllegalArgumentException if \u003ccode\u003einitialCapacity\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setNumElements(int)",
      "begin_line": 777,
      "end_line": 794,
      "comment": "\n     * This function allows you to control the number of elements contained\n     * in this array, and can be used to \"throw out\" the last n values in an\n     * array. This function will also expand the internal array as needed.\n     *\n     * @param i a new number of elements\n     * @throws MathIllegalArgumentException if \u003ccode\u003ei\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 784,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 793,col 9)-(line 793,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.shouldContract()",
      "begin_line": 802,
      "end_line": 808,
      "comment": "\n     * Returns true if the internal storage array has too many unused\n     * storage positions.\n     *\n     * @return true if array satisfies the contraction criteria\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 807,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.start()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * Returns the starting index of the internal array.  The starting index is\n     * the position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     *\n     * @return starting index\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.copy(org.apache.commons.math3.util.ResizableDoubleArray, org.apache.commons.math3.util.ResizableDoubleArray)",
      "begin_line": 840,
      "end_line": 857,
      "comment": "\n     * \u003cp\u003eCopies source to dest, copying the underlying data, so dest is\n     * a new, independent copy of source.  Does not contract before\n     * the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eObtains synchronization locks on both source and dest\n     * (in that order) before performing the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eNeither source nor dest may be null; otherwise a {@link NullArgumentException}\n     * is thrown\u003c/p\u003e\n     *\n     * @param source ResizableDoubleArray to copy\n     * @param dest ResizableArray to replace with a copy of the source array\n     * @exception NullArgumentException if either source or dest is null\n     * @since 2.0\n     *\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 39)",
        "(line 843,col 9)-(line 843,col 37)",
        "(line 844,col 9)-(line 856,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.copy()",
      "begin_line": 867,
      "end_line": 876,
      "comment": "\n     * Returns a copy of the ResizableDoubleArray.  Does not contract before\n     * the copy, so the returned object is an exact copy of this.\n     *\n     * @return a new ResizableDoubleArray with the same data and configuration\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 875,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.equals(java.lang.Object)",
      "begin_line": 887,
      "end_line": 912,
      "comment": "\n     * Returns true iff object is a ResizableDoubleArray with the same properties\n     * as this and an identical internal storage array.\n     *\n     * @param object object to be compared for equality with this\n     * @return true iff object is a ResizableDoubleArray with the same data and\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 8)-(line 894,col 9)",
        "(line 895,col 8)-(line 911,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.hashCode()",
      "begin_line": 920,
      "end_line": 931,
      "comment": "\n     * Returns a hash code consistent with equals.\n     *\n     * @return hash code representing this ResizableDoubleArray\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 36)",
        "(line 923,col 9)-(line 923,col 60)",
        "(line 924,col 9)-(line 924,col 64)",
        "(line 925,col 9)-(line 925,col 36)",
        "(line 926,col 13)-(line 926,col 57)",
        "(line 927,col 13)-(line 927,col 42)",
        "(line 928,col 13)-(line 928,col 38)",
        "(line 929,col 13)-(line 929,col 37)",
        "(line 930,col 9)-(line 930,col 41)"
      ]
    }
  ]
}