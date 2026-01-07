{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/utilities/OrderedTuple.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedTuple",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple\u003e"
      ],
      "begin_line": 94,
      "end_line": 429,
      "comment": " This class implements an ordering operation for T-uples.\n *\n * \u003cp\u003eOrdering is done by encoding all components of the T-uple into a\n * single scalar value and using this value as the sorting\n * key. Encoding is performed using the method invented by Georg\n * Cantor in 1877 when he proved it was possible to establish a\n * bijection between a line and a plane. The binary representations of\n * the components of the T-uple are mixed together to form a single\n * scalar. This means that the 2\u003csup\u003ek\u003c/sup\u003e bit of component 0 is\n * followed by the 2\u003csup\u003ek\u003c/sup\u003e bit of component 1, then by the\n * 2\u003csup\u003ek\u003c/sup\u003e bit of component 2 up to the 2\u003csup\u003ek\u003c/sup\u003e bit of\n * component {@code t}, which is followed by the 2\u003csup\u003ek-1\u003c/sup\u003e\n * bit of component 0, followed by the 2\u003csup\u003ek-1\u003c/sup\u003e bit of\n * component 1 ... The binary representations are extended as needed\n * to handle numbers with different scales and a suitable\n * 2\u003csup\u003ep\u003c/sup\u003e offset is added to the components in order to avoid\n * negative numbers (this offset is adjusted as needed during the\n * comparison operations).\u003c/p\u003e\n *\n * \u003cp\u003eThe more interesting property of the encoding method for our\n * purpose is that it allows to select all the points that are in a\n * given range. This is depicted in dimension 2 by the following\n * picture:\u003c/p\u003e\n *\n * \u003cimg src\u003d\"doc-files/OrderedTuple.png\" /\u003e\n *\n * \u003cp\u003eThis picture shows a set of 100000 random 2-D pairs having their\n * first component between -50 and +150 and their second component\n * between -350 and +50. We wanted to extract all pairs having their\n * first component between +30 and +70 and their second component\n * between -120 and -30. We built the lower left point at coordinates\n * (30, -120) and the upper right point at coordinates (70, -30). All\n * points smaller than the lower left point are drawn in red and all\n * points larger than the upper right point are drawn in blue. The\n * green points are between the two limits. This picture shows that\n * all the desired points are selected, along with spurious points. In\n * this case, we get 15790 points, 4420 of which really belonging to\n * the desired rectangle. It is possible to extract very small\n * subsets. As an example extracting from the same 100000 points set\n * the points having their first component between +30 and +31 and\n * their second component between -91 and -90, we get a subset of 11\n * points, 2 of which really belonging to the desired rectangle.\u003c/p\u003e\n *\n * \u003cp\u003ethe previous selection technique can be applied in all\n * dimensions, still using two points to define the interval. The\n * first point will have all its components set to their lower bounds\n * while the second point will have all its components set to their\n * upper bounds.\u003c/p\u003e\n *\n * \u003cp\u003eT-uples with negative infinite or positive infinite components\n * are sorted logically.\u003c/p\u003e\n *\n * \u003cp\u003eSince the specification of the {@code Comparator} interface\n * allows only {@code ClassCastException} errors, some arbitrary\n * choices have been made to handle specific cases. The rationale for\n * these choices is to keep \u003cem\u003eregular\u003c/em\u003e and consistent T-uples\n * together.\u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003einstances with different dimensions are sorted according to\n * their dimension regardless of their components values\u003c/li\u003e\n * \u003cli\u003einstances with {@code Double.NaN} components are sorted\n * after all other ones (even after instances with positive infinite\n * components\u003c/li\u003e\n * \u003cli\u003einstances with both positive and negative infinite components\n * are considered as if they had {@code Double.NaN}\n * components\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGN_MASK"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Sign bit mask. "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENT_MASK"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Exponent bits mask. "
    },
    {
      "type": "field",
      "varNames": [
        "MANTISSA_MASK"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Mantissa bits mask. "
    },
    {
      "type": "field",
      "varNames": [
        "IMPLICIT_ONE"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Implicit MSB for normalized numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "components"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Double components of the T-uple. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Offset scale. "
    },
    {
      "type": "field",
      "varNames": [
        "lsb"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Least Significant Bit scale. "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Ordering encoding of the double components. "
    },
    {
      "type": "field",
      "varNames": [
        "posInf"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Positive infinity marker. "
    },
    {
      "type": "field",
      "varNames": [
        "negInf"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Negative infinity marker. "
    },
    {
      "type": "field",
      "varNames": [
        "nan"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Not A Number marker. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.OrderedTuple(double...)",
      "begin_line": 132,
      "end_line": 175,
      "comment": " Build an ordered T-uple from its components.\n     * @param components double components of the T-uple\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 24)",
        "(line 139,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.encode(int)",
      "begin_line": 181,
      "end_line": 215,
      "comment": " Encode the T-uple with a given offset.\n     * @param minOffset minimal scale of the offset to add to all\n     * components (must be greater than the MSBs of all components)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 33)",
        "(line 185,col 9)-(line 185,col 30)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 196,col 61)",
        "(line 199,col 9)-(line 199,col 24)",
        "(line 200,col 9)-(line 200,col 25)",
        "(line 201,col 9)-(line 201,col 27)",
        "(line 202,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.compareTo(org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple)",
      "begin_line": 247,
      "end_line": 287,
      "comment": " Compares this ordered T-uple with the specified object.\n\n     * \u003cp\u003eThe ordering method is detailed in the general description of\n     * the class. Its main property is to be consistent with distance:\n     * geometrically close T-uples stay close to each other when stored\n     * in a sorted collection using this comparison method.\u003c/p\u003e\n\n     * \u003cp\u003eT-uples with negative infinite, positive infinite are sorted\n     * logically.\u003c/p\u003e\n\n     * \u003cp\u003eSome arbitrary choices have been made to handle specific\n     * cases. The rationale for these choices is to keep\n     * \u003cem\u003enormal\u003c/em\u003e and consistent T-uples together.\u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003einstances with different dimensions are sorted according to\n     * their dimension regardless of their components values\u003c/li\u003e\n     * \u003cli\u003einstances with {@code Double.NaN} components are sorted\n     * after all other ones (evan after instances with positive infinite\n     * components\u003c/li\u003e\n     * \u003cli\u003einstances with both positive and negative infinite components\n     * are considered as if they had {@code Double.NaN}\n     * components\u003c/li\u003e\n     * \u003c/ul\u003e\n\n     * @param ot T-uple to compare instance with\n     * @return a negative integer if the instance is less than the\n     * object, zero if they are equal, or a positive integer if the\n     * instance is greater than the object\n\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.equals(java.lang.Object)",
      "begin_line": 290,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.hashCode()",
      "begin_line": 302,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 34)",
        "(line 306,col 9)-(line 306,col 34)",
        "(line 307,col 9)-(line 307,col 34)",
        "(line 312,col 9)-(line 312,col 47)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 315,col 67)",
        "(line 316,col 9)-(line 316,col 67)",
        "(line 317,col 9)-(line 317,col 67)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.getComponents()",
      "begin_line": 326,
      "end_line": 328,
      "comment": " Get the components array.\n     * @return array containing the T-uple components\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.sign(long)",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Extract the sign from the bits of a double.\n     * @param bits binary representation of the double\n     * @return sign bit (zero if positive, non zero if negative)\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.exponent(long)",
      "begin_line": 342,
      "end_line": 344,
      "comment": " Extract the exponent from the bits of a double.\n     * @param bits binary representation of the double\n     * @return exponent\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.mantissa(long)",
      "begin_line": 350,
      "end_line": 354,
      "comment": " Extract the mantissa from the bits of a double.\n     * @param bits binary representation of the double\n     * @return mantissa\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.computeMSB(long)",
      "begin_line": 362,
      "end_line": 380,
      "comment": " Compute the most significant bit of a long.\n     * @param l long from which the most significant bit is requested\n     * @return scale of the most significant bit of {@code l},\n     * or 0 if {@code l} is zero\n     * @see #computeLSB\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 20)",
        "(line 365,col 9)-(line 365,col 33)",
        "(line 366,col 9)-(line 366,col 24)",
        "(line 367,col 9)-(line 367,col 23)",
        "(line 369,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.computeLSB(long)",
      "begin_line": 388,
      "end_line": 406,
      "comment": " Compute the least significant bit of a long.\n     * @param l long from which the least significant bit is requested\n     * @return scale of the least significant bit of {@code l},\n     * or 63 if {@code l} is zero\n     * @see #computeMSB\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 20)",
        "(line 391,col 9)-(line 391,col 41)",
        "(line 392,col 9)-(line 392,col 24)",
        "(line 393,col 9)-(line 393,col 23)",
        "(line 395,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.getBit(int, int)",
      "begin_line": 414,
      "end_line": 427,
      "comment": " Get a bit from the mantissa of a double.\n     * @param i index of the component\n     * @param k scale of the requested bit\n     * @return the specified bit (either 0 or 1), after the offset has\n     * been added to the double\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 65)",
        "(line 416,col 9)-(line 416,col 37)",
        "(line 417,col 9)-(line 426,col 9)"
      ]
    }
  ]
}