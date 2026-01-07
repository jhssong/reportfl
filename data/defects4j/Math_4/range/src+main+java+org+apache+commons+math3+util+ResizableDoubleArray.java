{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/ResizableDoubleArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResizableDoubleArray",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.DoubleArray",
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 1204,
      "comment": "\n * \u003cp\u003e\n * A variable length {@link DoubleArray} implementation that automatically\n * handles expanding and contracting its internal storage array as elements\n * are added and removed.\n * \u003c/p\u003e\n * \u003ch3\u003eImportant note: Usage should not assume that this class is thread-safe\n * even though some of the methods are {@code synchronized}.\n * This qualifier will be dropped in the next major release (4.0).\u003c/h3\u003e\n * \u003cp\u003e\n * The internal storage array starts with capacity determined by the\n * {@code initialCapacity} property, which can be set by the constructor.\n * The default initial capacity is 16.  Adding elements using\n * {@link #addElement(double)} appends elements to the end of the array.\n * When there are no open entries at the end of the internal storage array,\n * the array is expanded.  The size of the expanded array depends on the\n * {@code expansionMode} and {@code expansionFactor} properties.\n * The {@code expansionMode} determines whether the size of the array is\n * multiplied by the {@code expansionFactor}\n * ({@link ExpansionMode#MULTIPLICATIVE}) or if the expansion is additive\n * ({@link ExpansionMode#ADDITIVE} -- {@code expansionFactor} storage\n * locations added).\n * The default {@code expansionMode} is {@code MULTIPLICATIVE} and the default\n * {@code expansionFactor} is 2.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link #addElementRolling(double)} method adds a new element to the end\n * of the internal storage array and adjusts the \"usable window\" of the\n * internal array forward by one position (effectively making what was the\n * second element the first, and so on).  Repeated activations of this method\n * (or activation of {@link #discardFrontElements(int)}) will effectively orphan\n * the storage locations at the beginning of the internal storage array.  To\n * reclaim this storage, each time one of these methods is activated, the size\n * of the internal storage array is compared to the number of addressable\n * elements (the {@code numElements} property) and if the difference\n * is too large, the internal array is contracted to size\n * {@code numElements + 1}.  The determination of when the internal\n * storage array is \"too large\" depends on the {@code expansionMode} and\n * {@code contractionFactor} properties.  If  the {@code expansionMode}\n * is {@code MULTIPLICATIVE}, contraction is triggered when the\n * ratio between storage array length and {@code numElements} exceeds\n * {@code contractionFactor.}  If the {@code expansionMode}\n * is {@code ADDITIVE}, the number of excess storage locations\n * is compared to {@code contractionFactor}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * To avoid cycles of expansions and contractions, the\n * {@code expansionFactor} must not exceed the {@code contractionFactor}.\n * Constructors and mutators for both of these properties enforce this\n * requirement, throwing a {@code MathIllegalArgumentException} if it is\n * violated.\n * \u003c/p\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADDITIVE_MODE"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": " Additive expansion mode.\n     * @deprecated As of 3.1. Please use {@link ExpansionMode#ADDITIVE} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLICATIVE_MODE"
      ],
      "begin_line": 93,
      "end_line": 94,
      "comment": " Multiplicative expansion mode.\n     * @deprecated As of 3.1. Please use {@link ExpansionMode#MULTIPLICATIVE} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_CAPACITY"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Default value for initial capacity. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPANSION_FACTOR"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Default value for array size modifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CONTRACTION_DELTA"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Default value for the difference between {@link #contractionCriterion}\n     * and {@link #expansionFactor}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contractionCriterion"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * The contraction criteria determines when the internal array will be\n     * contracted to fit the number of elements contained in the element\n     *  array + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionFactor"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * The expansion factor of the array.  When the array needs to be expanded,\n     * the new array size will be\n     * {@code internalArray.length * expansionFactor}\n     * if {@code expansionMode} is set to MULTIPLICATIVE_MODE, or\n     * {@code internalArray.length + expansionFactor} if\n     * {@code expansionMode} is set to ADDITIVE_MODE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expansionMode"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Determines whether array expansion by {@code expansionFactor}\n     * is additive or multiplicative.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalArray"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * The internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numElements"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The number of addressable elements in the array.  Note that this\n     * has nothing to do with the length of the internal storage array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * The position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are\n     * {@code internalArray[startIndex],...,internalArray[startIndex + numElements - 1]}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Creates an instance with default properties.\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003d 16}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionMode \u003d MULTIPLICATIVE}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003d 2.0}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003d 2.5}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Creates an instance with the specified initial capacity.\n     * Other properties take default values:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code expansionMode \u003d MULTIPLICATIVE}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003d 2.0}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003d 2.5}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param initialCapacity Initial size of the internal storage array.\n     * @throws MathIllegalArgumentException if {@code initialCapacity \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(double[])",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * Creates an instance from an existing {@code double[]} with the\n     * initial capacity and numElements corresponding to the size of\n     * the supplied {@code double[]} array.\n     * If the supplied array is null, a new empty array with the default\n     * initial capacity will be created.\n     * The input array is copied, not referenced.\n     * Other properties take default values:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003d 16}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionMode \u003d MULTIPLICATIVE}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003d 2.0}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003d 2.5}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialArray initial array\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float)",
      "begin_line": 238,
      "end_line": 244,
      "comment": "\n     * Creates an instance with the specified initial capacity\n     * and expansion factor.\n     * The remaining properties take default values:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code expansionMode \u003d MULTIPLICATIVE}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003d 0.5 + expansionFactor}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cbr/\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003e 0}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003e 1}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialCapacity Initial size of the internal storage array.\n     * @param expansionFactor The array will be expanded based on this\n     * parameter.\n     * @throws MathIllegalArgumentException if parameters are not valid.\n     * @deprecated As of 3.1. Please use\n     * {@link #ResizableDoubleArray(int,double)} instead.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, double)",
      "begin_line": 268,
      "end_line": 274,
      "comment": "\n     * Creates an instance with the specified initial capacity\n     * and expansion factor.\n     * The remaining properties take default values:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code expansionMode \u003d MULTIPLICATIVE}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003d 0.5 + expansionFactor}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cbr/\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003e 0}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003e 1}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialCapacity Initial size of the internal storage array.\n     * @param expansionFactor The array will be expanded based on this\n     * parameter.\n     * @throws MathIllegalArgumentException if parameters are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float)",
      "begin_line": 297,
      "end_line": 305,
      "comment": "\n     * Creates an instance with the specified initialCapacity,\n     * expansionFactor, and contractionCriterion.\n     * The expansion mode will default to {@code MULTIPLICATIVE}.\n     * \u003cbr/\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003e 0}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003e 1}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003e\u003d expansionFactor}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialCapacity Initial size of the internal storage array..\n     * @param expansionFactor The array will be expanded based on this\n     * parameter.\n     * @param contractionCriteria Contraction criteria.\n     * @throws MathIllegalArgumentException if parameters are not valid.\n     * @deprecated As of 3.1. Please use\n     * {@link #ResizableDoubleArray(int,double,double)} instead.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, double, double)",
      "begin_line": 327,
      "end_line": 336,
      "comment": "\n     * Creates an instance with the specified initial capacity,\n     * expansion factor, and contraction criteria.\n     * The expansion mode will default to {@code MULTIPLICATIVE}.\n     * \u003cbr/\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003e 0}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003e 1}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003e\u003d expansionFactor}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialCapacity Initial size of the internal storage array..\n     * @param expansionFactor The array will be expanded based on this\n     * parameter.\n     * @param contractionCriterion Contraction criterion.\n     * @throws MathIllegalArgumentException if the parameters are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 335,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, float, float, int)",
      "begin_line": 362,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003e\n     * Create a ResizableArray with the specified properties.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einitialCapacity \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionMode in {MULTIPLICATIVE_MODE, ADDITIVE_MODE}\u003c/code\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param initialCapacity the initial size of the internal storage array\n     * @param expansionFactor the array will be expanded based on this\n     *                        parameter\n     * @param contractionCriteria the contraction Criteria\n     * @param expansionMode  the expansion mode\n     * @throws MathIllegalArgumentException if parameters are not valid\n     * @deprecated As of 3.1. Please use\n     * {@link #ResizableDoubleArray(int,double,double,ExpansionMode,double[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 370,col 19)",
        "(line 373,col 9)-(line 373,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(int, double, double, org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode, double...)",
      "begin_line": 395,
      "end_line": 417,
      "comment": "\n     * Creates an instance with the specified properties.\n     * \u003cbr/\u003e\n     * Throws MathIllegalArgumentException if the following conditions are\n     * not met:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code initialCapacity \u003e 0}\u003c/li\u003e\n     *  \u003cli\u003e{@code expansionFactor \u003e 1}\u003c/li\u003e\n     *  \u003cli\u003e{@code contractionCriterion \u003e\u003d expansionFactor}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param initialCapacity Initial size of the internal storage array.\n     * @param expansionFactor The array will be expanded based on this\n     * parameter.\n     * @param contractionCriterion Contraction criteria.\n     * @param expansionMode Expansion mode.\n     * @param data Initial contents of the array.\n     * @throws MathIllegalArgumentException if the parameters are not valid.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 67)",
        "(line 407,col 9)-(line 407,col 47)",
        "(line 408,col 9)-(line 408,col 57)",
        "(line 409,col 9)-(line 409,col 43)",
        "(line 410,col 9)-(line 410,col 52)",
        "(line 411,col 9)-(line 411,col 24)",
        "(line 412,col 9)-(line 412,col 23)",
        "(line 414,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.ResizableDoubleArray(org.apache.commons.math3.util.ResizableDoubleArray)",
      "begin_line": 429,
      "end_line": 433,
      "comment": "\n     * Copy constructor.  Creates a new ResizableDoubleArray that is a deep,\n     * fresh copy of the original. Needs to acquire synchronization lock\n     * on original.  Original may not be null; otherwise a {@link NullArgumentException}\n     * is thrown.\n     *\n     * @param original array to copy\n     * @exception NullArgumentException if original is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 41)",
        "(line 432,col 9)-(line 432,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElement(double)",
      "begin_line": 440,
      "end_line": 445,
      "comment": "\n     * Adds an element to the end of this expandable array.\n     *\n     * @param value Value to be added to end of array.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElements(double[])",
      "begin_line": 453,
      "end_line": 460,
      "comment": "\n     * Adds several element to the end of this expandable array.\n     *\n     * @param values Values to be added to end of array.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 79)",
        "(line 455,col 9)-(line 455,col 79)",
        "(line 456,col 9)-(line 456,col 75)",
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 458,col 23)",
        "(line 459,col 9)-(line 459,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.addElementRolling(double)",
      "begin_line": 478,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003e\n     * Adds an element to the end of the array and removes the first\n     * element in the array.  Returns the discarded first element.\n     * The effect is similar to a push operation in a FIFO queue.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)\n     * and addElementRolling(5) is invoked, the result is an array containing\n     * the entries 2, 3, 4, 5 and the value returned is 1.\n     * \u003c/p\u003e\n     *\n     * @param value Value to be added to the array.\n     * @return the value which has been discarded or \"pushed\" out of the array\n     * by this rolling insert.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 53)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 24)",
        "(line 488,col 9)-(line 488,col 62)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.substituteMostRecentElement(double)",
      "begin_line": 507,
      "end_line": 520,
      "comment": "\n     * Substitutes \u003ccode\u003evalue\u003c/code\u003e for the most recently added value.\n     * Returns the value that has been replaced. If the array is empty (i.e.\n     * if {@link #numElements} is zero), an IllegalStateException is thrown.\n     *\n     * @param value New value to substitute for the most recently added value\n     * @return the value that has been replaced in the array.\n     * @throws MathIllegalStateException if the array is empty\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 62)",
        "(line 515,col 9)-(line 515,col 59)",
        "(line 517,col 9)-(line 517,col 42)",
        "(line 519,col 9)-(line 519,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.checkContractExpand(float, float)",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\n     * Checks the expansion factor and the contraction criterion and throws an\n     * IllegalArgumentException if the contractionCriteria is less than the\n     * expansionCriteria\n     *\n     * @param expansion factor to be checked\n     * @param contraction criteria to be checked\n     * @throws MathIllegalArgumentException if the contractionCriteria is less than\n     * the expansionCriteria.\n     * @deprecated As of 3.1. Please use\n     * {@link #checkContractExpand(double,double)} instead.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 537,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.checkContractExpand(double, double)",
      "begin_line": 552,
      "end_line": 575,
      "comment": "\n     * Checks the expansion factor and the contraction criterion and raises\n     * an exception if the contraction criterion is smaller than the\n     * expansion criterion.\n     *\n     * @param contraction Criterion to be checked.\n     * @param expansion Factor to be checked.\n     * @throws NumberIsTooSmallException if {@code contraction \u003c expansion}.\n     * @throws NumberIsTooSmallException if {@code contraction \u003c\u003d 1}.\n     * @throws NumberIsTooSmallException if {@code expansion \u003c\u003d 1 }.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 574,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.clear()",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\n     * Clear the array contents, resetting the number of elements to zero.\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 24)",
        "(line 582,col 9)-(line 582,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.contract()",
      "begin_line": 590,
      "end_line": 599,
      "comment": "\n     * Contracts the storage array to the (size of the element set) + 1 - to\n     * avoid a zero length array. This function also resets the startIndex to\n     * zero.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 63)",
        "(line 594,col 9)-(line 594,col 79)",
        "(line 595,col 9)-(line 595,col 34)",
        "(line 598,col 9)-(line 598,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardFrontElements(int)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e initial elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardFrontElements(2)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardMostRecentElements(int)",
      "begin_line": 628,
      "end_line": 631,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e last elements of the array.  For example,\n     * if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardMostRecentElements(2)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.  Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the end of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.discardExtremeElements(int, boolean)",
      "begin_line": 652,
      "end_line": 673,
      "comment": "\n     * Discards the \u003ccode\u003ei\u003c/code\u003e first or last elements of the array,\n     * depending on the value of \u003ccode\u003efront\u003c/code\u003e.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,false)\u003c/code\u003e will cause the last two elements\n     * to be discarded, leaving 1,2 in the array.\n     * For example, if the array contains the elements 1,2,3,4, invoking\n     * \u003ccode\u003ediscardExtremeElements(2,true)\u003c/code\u003e will cause the first two elements\n     * to be discarded, leaving 3,4 in the array.\n     * Throws illegalArgumentException\n     * if i exceeds numElements.\n     *\n     * @param i  the number of elements to discard from the front/end of the array\n     * @param front true if elements are to be discarded from the front\n     * of the array, false if elements are to be discarded from the end\n     * of the array\n     * @throws MathIllegalArgumentException if i is greater than numElements.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.expand()",
      "begin_line": 684,
      "end_line": 701,
      "comment": "\n     * Expands the internal storage array using the expansion factor.\n     * \u003cp\u003e\n     * if \u003ccode\u003eexpansionMode\u003c/code\u003e is set to MULTIPLICATIVE_MODE,\n     * the new array size will be \u003ccode\u003einternalArray.length * expansionFactor.\u003c/code\u003e\n     * If \u003ccode\u003eexpansionMode\u003c/code\u003e is set to ADDITIVE_MODE,  the length\n     * after expansion will be \u003ccode\u003einternalArray.length + expansionFactor\u003c/code\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 24)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 55)",
        "(line 699,col 9)-(line 699,col 79)",
        "(line 700,col 9)-(line 700,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.expandTo(int)",
      "begin_line": 708,
      "end_line": 713,
      "comment": "\n     * Expands the internal storage array to the specified size.\n     *\n     * @param size Size of the new internal storage array.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 52)",
        "(line 711,col 9)-(line 711,col 79)",
        "(line 712,col 9)-(line 712,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getContractionCriteria()",
      "begin_line": 729,
      "end_line": 732,
      "comment": "\n     * The contraction criteria defines when the internal array will contract\n     * to store only the number of elements in the element array.\n     * If  the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e,\n     * contraction is triggered when the ratio between storage array length\n     * and \u003ccode\u003enumElements\u003c/code\u003e exceeds \u003ccode\u003econtractionFactor\u003c/code\u003e.\n     * If the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eADDITIVE_MODE\u003c/code\u003e, the\n     * number of excess storage locations is compared to\n     * \u003ccode\u003econtractionFactor.\u003c/code\u003e\n     *\n     * @return the contraction criteria used to reclaim memory.\n     * @deprecated As of 3.1. Please use {@link #getContractionCriterion()}\n     * instead.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getContractionCriterion()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * The contraction criterion defines when the internal array will contract\n     * to store only the number of elements in the element array.\n     * If  the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eMULTIPLICATIVE_MODE\u003c/code\u003e,\n     * contraction is triggered when the ratio between storage array length\n     * and \u003ccode\u003enumElements\u003c/code\u003e exceeds \u003ccode\u003econtractionFactor\u003c/code\u003e.\n     * If the \u003ccode\u003eexpansionMode\u003c/code\u003e is \u003ccode\u003eADDITIVE_MODE\u003c/code\u003e, the\n     * number of excess storage locations is compared to\n     * \u003ccode\u003econtractionFactor.\u003c/code\u003e\n     *\n     * @return the contraction criterion used to reclaim memory.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getElement(int)",
      "begin_line": 759,
      "end_line": 767,
      "comment": "\n     * Returns the element at the specified index\n     *\n     * @param index index to fetch a value from\n     * @return value stored at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     * zero or is greater than \u003ccode\u003egetNumElements() - 1\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getElements()",
      "begin_line": 776,
      "end_line": 780,
      "comment": "\n     * Returns a double array containing the elements of this\n     * \u003ccode\u003eResizableArray\u003c/code\u003e.  This method returns a copy, not a\n     * reference to the underlying array, so that changes made to the returned\n     *  array have no effect on this \u003ccode\u003eResizableArray.\u003c/code\u003e\n     * @return the double array.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 62)",
        "(line 778,col 9)-(line 778,col 82)",
        "(line 779,col 9)-(line 779,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getExpansionFactor()",
      "begin_line": 795,
      "end_line": 798,
      "comment": "\n     * The expansion factor controls the size of a new array when an array\n     * needs to be expanded.  The \u003ccode\u003eexpansionMode\u003c/code\u003e\n     * determines whether the size of the array is multiplied by the\n     * \u003ccode\u003eexpansionFactor\u003c/code\u003e (MULTIPLICATIVE_MODE) or if\n     * the expansion is additive (ADDITIVE_MODE -- \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * storage locations added).  The default \u003ccode\u003eexpansionMode\u003c/code\u003e is\n     * MULTIPLICATIVE_MODE and the default \u003ccode\u003eexpansionFactor\u003c/code\u003e\n     * is 2.0.\n     *\n     * @return the expansion factor of this expandable double array\n     * @deprecated As of 3.1. Return type will be changed to \"double\" in 4.0.\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getExpansionMode()",
      "begin_line": 808,
      "end_line": 817,
      "comment": "\n     * The expansion mode determines whether the internal storage\n     * array grows additively or multiplicatively when it is expanded.\n     *\n     * @return the expansion mode.\n     * @deprecated As of 3.1. Return value to be changed to\n     * {@link ExpansionMode} in 4.0.\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 816,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getInternalLength()",
      "begin_line": 828,
      "end_line": 831,
      "comment": "\n     * Notice the package scope on this method.   This method is simply here\n     * for the JUnit test, it allows us check if the expansion is working\n     * properly after a number of expansions.  This is not meant to be a part\n     * of the public interface of this class.\n     *\n     * @return the length of the internal storage array.\n     * @deprecated As of 3.1. Please use {@link #getCapacity()} instead.\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getCapacity()",
      "begin_line": 842,
      "end_line": 844,
      "comment": "\n     * Gets the currently allocated size of the internal data structure used\n     * for storing elements.\n     * This is not to be confused with {@link #getNumElements() the number of\n     * elements actually stored}.\n     *\n     * @return the length of the internal array.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getNumElements()",
      "begin_line": 852,
      "end_line": 854,
      "comment": "\n     * Returns the number of elements currently in the array.  Please note\n     * that this is different from the length of the internal storage array.\n     *\n     * @return the number of elements.\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getInternalValues()",
      "begin_line": 869,
      "end_line": 872,
      "comment": "\n     * Returns the internal storage array.  Note that this method returns\n     * a reference to the internal storage array, not a copy, and to correctly\n     * address elements of the array, the \u003ccode\u003estartIndex\u003c/code\u003e is\n     * required (available via the {@link #start} method).  This method should\n     * only be used in cases where copying the internal array is not practical.\n     * The {@link #getElements} method should be used in all other cases.\n     *\n     *\n     * @return the internal storage array used by this object\n     * @since 2.0\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getArrayRef()",
      "begin_line": 893,
      "end_line": 895,
      "comment": "\n     * Provides \u003cem\u003edirect\u003c/em\u003e access to the internal storage array.\n     * Please note that this method returns a reference to this object\u0027s\n     * storage array, not a copy.\n     * \u003cbr/\u003e\n     * To correctly address elements of the array, the \"start index\" is\n     * required (available via the {@link #getStartIndex() getStartIndex}\n     * method.\n     * \u003cbr/\u003e\n     * This method should only be used to avoid copying the internal array.\n     * The returned value \u003cem\u003emust\u003c/em\u003e be used for reading only; other\n     * uses could lead to this object becoming inconsistent.\n     * \u003cbr/\u003e\n     * The {@link #getElements} method has no such limitation since it\n     * returns a copy of this array\u0027s addressable elements.\n     *\n     * @return the internal storage array used by this object.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.getStartIndex()",
      "begin_line": 908,
      "end_line": 910,
      "comment": "\n     * Returns the \"start index\" of the internal array.\n     * This index is the position of the first addressable element in the\n     * internal storage array.\n     * The addressable elements in the array are at indices contained in\n     * the interval [{@link #getStartIndex()},\n     *               {@link #getStartIndex()} + {@link #getNumElements()} - 1].\n     *\n     * @return the start index.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setContractionCriteria(float)",
      "begin_line": 920,
      "end_line": 927,
      "comment": "\n     * Sets the contraction criteria.\n     *\n     * @param contractionCriteria contraction criteria\n     * @throws MathIllegalArgumentException if the contractionCriteria is less than\n     *         the expansionCriteria.\n     * @deprecated As of 3.1 (to be removed in 4.0 as field will become \"final\").\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 71)",
        "(line 924,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.compute(org.apache.commons.math3.util.MathArrays.Function)",
      "begin_line": 936,
      "end_line": 946,
      "comment": "\n     * Performs an operation on the addressable elements of the array.\n     *\n     * @param f Function to be applied on this array.\n     * @return the result.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 29)",
        "(line 938,col 9)-(line 938,col 24)",
        "(line 939,col 9)-(line 939,col 22)",
        "(line 940,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setElement(int, double)",
      "begin_line": 959,
      "end_line": 970,
      "comment": "\n     * Sets the element at the specified index.  If the specified index is greater than\n     * \u003ccode\u003egetNumElements() - 1\u003c/code\u003e, the \u003ccode\u003enumElements\u003c/code\u003e property\n     * is increased to \u003ccode\u003eindex +1\u003c/code\u003e and additional storage is allocated\n     * (if necessary) for the new element and all  (uninitialized) elements\n     * between the new element and the previous end of the array).\n     *\n     * @param index index to store a value in\n     * @param value value to store at the specified index\n     * @throws ArrayIndexOutOfBoundsException if {@code index \u003c 0}.\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setExpansionFactor(float)",
      "begin_line": 984,
      "end_line": 991,
      "comment": "\n     * Sets the expansionFactor.  Throws IllegalArgumentException if the\n     * the following conditions are not met:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003eexpansionFactor \u003e 1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003econtractionFactor \u003e\u003d expansionFactor\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param expansionFactor the new expansion factor value.\n     * @throws MathIllegalArgumentException if expansionFactor is \u003c\u003d 1 or greater\n     * than contractionFactor\n     * @deprecated As of 3.1 (to be removed in 4.0 as field will become \"final\").\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 72)",
        "(line 988,col 9)-(line 990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setExpansionMode(int)",
      "begin_line": 1001,
      "end_line": 1017,
      "comment": "\n     * Sets the \u003ccode\u003eexpansionMode\u003c/code\u003e. The specified value must be one of\n     * ADDITIVE_MODE, MULTIPLICATIVE_MODE.\n     *\n     * @param expansionMode The expansionMode to set.\n     * @throws MathIllegalArgumentException if the specified mode value is not valid.\n     * @deprecated As of 3.1. Please use {@link #setExpansionMode(ExpansionMode)} instead.\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1016,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setExpansionMode(org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode)",
      "begin_line": 1025,
      "end_line": 1028,
      "comment": "\n     * Sets the {@link ExpansionMode expansion mode}.\n     *\n     * @param expansionMode Expansion mode to use for resizing the array.\n     * @deprecated As of 3.1 (to be removed in 4.0 as field will become \"final\").\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setInitialCapacity(int)",
      "begin_line": 1038,
      "end_line": 1042,
      "comment": "\n     * Sets the initial capacity.  Should only be invoked by constructors.\n     *\n     * @param initialCapacity of the array\n     * @throws MathIllegalArgumentException if \u003ccode\u003einitialCapacity\u003c/code\u003e is not\n     * positive.\n     * @deprecated As of 3.1, this is a no-op.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.setNumElements(int)",
      "begin_line": 1052,
      "end_line": 1070,
      "comment": "\n     * This function allows you to control the number of elements contained\n     * in this array, and can be used to \"throw out\" the last n values in an\n     * array. This function will also expand the internal array as needed.\n     *\n     * @param i a new number of elements\n     * @throws MathIllegalArgumentException if \u003ccode\u003ei\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1059,col 9)",
        "(line 1063,col 9)-(line 1063,col 43)",
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1069,col 9)-(line 1069,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.shouldContract()",
      "begin_line": 1078,
      "end_line": 1084,
      "comment": "\n     * Returns true if the internal storage array has too many unused\n     * storage positions.\n     *\n     * @return true if array satisfies the contraction criteria\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1083,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.start()",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": "\n     * Returns the starting index of the internal array.  The starting index is\n     * the position of the first addressable element in the internal storage\n     * array.  The addressable elements in the array are \u003ccode\u003e\n     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]\n     * \u003c/code\u003e\n     *\n     * @return the starting index.\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.copy(org.apache.commons.math3.util.ResizableDoubleArray, org.apache.commons.math3.util.ResizableDoubleArray)",
      "begin_line": 1118,
      "end_line": 1135,
      "comment": "\n     * \u003cp\u003eCopies source to dest, copying the underlying data, so dest is\n     * a new, independent copy of source.  Does not contract before\n     * the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eObtains synchronization locks on both source and dest\n     * (in that order) before performing the copy.\u003c/p\u003e\n     *\n     * \u003cp\u003eNeither source nor dest may be null; otherwise a {@link NullArgumentException}\n     * is thrown\u003c/p\u003e\n     *\n     * @param source ResizableDoubleArray to copy\n     * @param dest ResizableArray to replace with a copy of the source array\n     * @exception NullArgumentException if either source or dest is null\n     * @since 2.0\n     *\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 39)",
        "(line 1122,col 9)-(line 1122,col 37)",
        "(line 1123,col 9)-(line 1134,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.copy()",
      "begin_line": 1145,
      "end_line": 1149,
      "comment": "\n     * Returns a copy of the ResizableDoubleArray.  Does not contract before\n     * the copy, so the returned object is an exact copy of this.\n     *\n     * @return a new ResizableDoubleArray with the same data and configuration\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1146,col 71)",
        "(line 1147,col 9)-(line 1147,col 27)",
        "(line 1148,col 9)-(line 1148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.equals(java.lang.Object)",
      "begin_line": 1160,
      "end_line": 1184,
      "comment": "\n     * Returns true iff object is a ResizableDoubleArray with the same properties\n     * as this and an identical internal storage array.\n     *\n     * @param object object to be compared for equality with this\n     * @return true iff object is a ResizableDoubleArray with the same data and\n     * properties as this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ResizableDoubleArray.hashCode()",
      "begin_line": 1192,
      "end_line": 1202,
      "comment": "\n     * Returns a hash code consistent with equals.\n     *\n     * @return the hash code representing this {@code ResizableDoubleArray}.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1194,col 42)",
        "(line 1195,col 9)-(line 1195,col 65)",
        "(line 1196,col 9)-(line 1196,col 70)",
        "(line 1197,col 9)-(line 1197,col 47)",
        "(line 1198,col 9)-(line 1198,col 53)",
        "(line 1199,col 9)-(line 1199,col 34)",
        "(line 1200,col 9)-(line 1200,col 33)",
        "(line 1201,col 9)-(line 1201,col 41)"
      ]
    }
  ]
}