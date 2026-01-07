{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 660,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     *  Serial version id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(FieldElement)},\n     * {@link #append(FieldElement[])}, {@link #append(FieldVector)},\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\u003c/p\u003e\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param field field to which the elements belong\n     * @param dimension Size of the vector\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 27)",
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Build a resized vector, for use with append.\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 80,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     * @param field field to which the elements belong\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[])",
      "begin_line": 102,
      "end_line": 110,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored\n     * @param field field to which the elements belong\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 36)",
        "(line 105,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntries()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Get the entries of this instance.\n     * @return entries of this instance\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 138,
      "end_line": 154,
      "comment": "\n     * Optimized method to add sparse vectors.\n     * @param v vector to add\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 48)",
        "(line 140,col 9)-(line 140,col 64)",
        "(line 141,col 9)-(line 141,col 75)",
        "(line 142,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(T[])",
      "begin_line": 158,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 160,col 82)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 172,
      "end_line": 180,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 84)",
        "(line 174,col 9)-(line 174,col 70)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 183,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T)",
      "begin_line": 192,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 63)",
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T[])",
      "begin_line": 199,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 70)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.copy()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 213,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)",
        "(line 215,col 9)-(line 215,col 32)",
        "(line 216,col 9)-(line 216,col 68)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(T[])",
      "begin_line": 225,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 227,col 32)",
        "(line 228,col 9)-(line 228,col 68)",
        "(line 229,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 241,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 66)",
        "(line 245,col 9)-(line 245,col 72)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(T[])",
      "begin_line": 254,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 66)",
        "(line 257,col 9)-(line 257,col 72)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 266,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 48)",
        "(line 268,col 9)-(line 268,col 66)",
        "(line 269,col 9)-(line 269,col 72)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(T[])",
      "begin_line": 278,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 66)",
        "(line 281,col 9)-(line 281,col 72)",
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getData()",
      "begin_line": 290,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getDimension()",
      "begin_line": 301,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 306,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 26)",
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getField()",
      "begin_line": 312,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 317,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 320,col 34)",
        "(line 321,col 9)-(line 321,col 69)",
        "(line 322,col 9)-(line 322,col 28)",
        "(line 323,col 9)-(line 323,col 68)",
        "(line 324,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 335,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 340,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 348,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 353,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 68)",
        "(line 355,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInv()",
      "begin_line": 363,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 368,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 376,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 381,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 68)",
        "(line 383,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 391,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 396,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 406,
      "end_line": 420,
      "comment": "\n      * Optimized method to compute outer product when both vectors are sparse.\n      * @param v vector with which outer product should be computed\n      * @return the square matrix outer product between instance and v\n      * @throws IllegalArgumentException if v is not the same size as {@code this}\n      ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 48)",
        "(line 409,col 9)-(line 409,col 93)",
        "(line 410,col 9)-(line 410,col 68)",
        "(line 411,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(T[])",
      "begin_line": 423,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 40)",
        "(line 425,col 9)-(line 425,col 87)",
        "(line 426,col 9)-(line 426,col 68)",
        "(line 427,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 439,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 444,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 448,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 48)",
        "(line 451,col 9)-(line 451,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(T[])",
      "begin_line": 455,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 40)",
        "(line 457,col 9)-(line 457,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.set(T)",
      "begin_line": 461,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 468,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 26)",
        "(line 470,col 9)-(line 470,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 474,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 26)",
        "(line 477,col 9)-(line 477,col 49)",
        "(line 478,col 9)-(line 478,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, T[])",
      "begin_line": 482,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 26)",
        "(line 484,col 9)-(line 484,col 41)",
        "(line 485,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 497,
      "end_line": 511,
      "comment": "\n     * Optimized method to subtract SparseRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 48)",
        "(line 499,col 9)-(line 499,col 64)",
        "(line 500,col 9)-(line 500,col 75)",
        "(line 501,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 514,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 9)-(line 519,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(T[])",
      "begin_line": 523,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 40)",
        "(line 525,col 9)-(line 525,col 66)",
        "(line 526,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.toArray()",
      "begin_line": 537,
      "end_line": 539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index\n     *            index to check\n     * @exception MatrixIndexException\n     *                if index is not valid\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 565,
      "end_line": 571,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n\n     *            expected dimension.\n     * @exception IllegalArgumentException\n     *                if the dimension is inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 575,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.buildArray(int)",
      "begin_line": 587,
      "end_line": 590,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.hashCode()",
      "begin_line": 594,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 29)",
        "(line 597,col 9)-(line 597,col 23)",
        "(line 598,col 9)-(line 598,col 75)",
        "(line 599,col 9)-(line 599,col 46)",
        "(line 600,col 9)-(line 600,col 68)",
        "(line 601,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.equals(java.lang.Object)",
      "begin_line": 611,
      "end_line": 656,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 64)",
        "(line 628,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 68)",
        "(line 640,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 45)",
        "(line 648,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    }
  ]
}