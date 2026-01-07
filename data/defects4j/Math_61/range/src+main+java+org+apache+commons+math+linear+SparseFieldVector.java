{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 657,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     *  Serial version id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(FieldElement)},\n     * {@link #append(FieldElement[])}, {@link #append(FieldVector)},\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\u003c/p\u003e\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param field field to which the elements belong\n     * @param dimension Size of the vector\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 32)",
        "(line 70,col 9)-(line 70,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Build a resized vector, for use with append.\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)",
        "(line 80,col 9)-(line 80,col 48)",
        "(line 81,col 9)-(line 81,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     * @param field field to which the elements belong\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 94,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[])",
      "begin_line": 103,
      "end_line": 111,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored\n     * @param field field to which the elements belong\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 54)",
        "(line 107,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntries()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get the entries of this instance.\n     * @return entries of this instance\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 139,
      "end_line": 155,
      "comment": "\n     * Optimized method to add sparse vectors.\n     * @param v vector to add\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 141,col 64)",
        "(line 142,col 9)-(line 142,col 75)",
        "(line 143,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(T[])",
      "begin_line": 159,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 161,col 82)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 84)",
        "(line 175,col 9)-(line 175,col 70)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 184,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T)",
      "begin_line": 193,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 63)",
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T[])",
      "begin_line": 200,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.copy()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 214,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 48)",
        "(line 216,col 9)-(line 216,col 32)",
        "(line 217,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(T[])",
      "begin_line": 226,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 32)",
        "(line 229,col 9)-(line 229,col 68)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 242,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 72)",
        "(line 247,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(T[])",
      "begin_line": 255,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 257,col 66)",
        "(line 258,col 9)-(line 258,col 72)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 267,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 48)",
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 72)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(T[])",
      "begin_line": 279,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 66)",
        "(line 282,col 9)-(line 282,col 72)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getData()",
      "begin_line": 291,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 42)",
        "(line 293,col 9)-(line 293,col 68)",
        "(line 294,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getDimension()",
      "begin_line": 302,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 307,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 26)",
        "(line 309,col 9)-(line 309,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getField()",
      "begin_line": 313,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 318,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 34)",
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 28)",
        "(line 324,col 9)-(line 324,col 68)",
        "(line 325,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 336,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 341,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 349,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 354,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 68)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInv()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 369,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 382,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 68)",
        "(line 384,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 397,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 407,
      "end_line": 421,
      "comment": "\n      * Optimized method to compute outer product when both vectors are sparse.\n      * @param v vector with which outer product should be computed\n      * @return the square matrix outer product between instance and v\n      * @throws IllegalArgumentException if v is not the same size as {@code this}\n      ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 48)",
        "(line 410,col 9)-(line 410,col 93)",
        "(line 411,col 9)-(line 411,col 68)",
        "(line 412,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(T[])",
      "begin_line": 424,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 40)",
        "(line 426,col 9)-(line 426,col 87)",
        "(line 427,col 9)-(line 427,col 68)",
        "(line 428,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 440,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 9)-(line 445,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 449,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 48)",
        "(line 452,col 9)-(line 452,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(T[])",
      "begin_line": 456,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 40)",
        "(line 458,col 9)-(line 458,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.set(T)",
      "begin_line": 462,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 469,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 26)",
        "(line 471,col 9)-(line 471,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 475,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 26)",
        "(line 478,col 9)-(line 478,col 49)",
        "(line 479,col 9)-(line 479,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, T[])",
      "begin_line": 483,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 26)",
        "(line 485,col 9)-(line 485,col 41)",
        "(line 486,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 498,
      "end_line": 512,
      "comment": "\n     * Optimized method to subtract SparseRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 48)",
        "(line 500,col 9)-(line 500,col 64)",
        "(line 501,col 9)-(line 501,col 75)",
        "(line 502,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 515,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 517,col 9)-(line 520,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(T[])",
      "begin_line": 524,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 40)",
        "(line 526,col 9)-(line 526,col 66)",
        "(line 527,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.toArray()",
      "begin_line": 538,
      "end_line": 540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 550,
      "end_line": 555,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index\n     *            index to check\n     * @exception MatrixIndexException\n     *                if index is not valid\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 554,col 9)"
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
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 622,col 9)-(line 624,col 64)",
        "(line 625,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 636,col 68)",
        "(line 637,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 45)",
        "(line 645,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 20)"
      ]
    }
  ]
}