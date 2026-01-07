{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/transform/RealTransformerAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealTransformerAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 469,
      "comment": "\n * Abstract test for classes implementing the {@link RealTransformer} interface.\n * This abstract test handles the automatic generation of random data of various\n * sizes. For each generated data array, actual values (returned by the\n * transformer to be tested) are compared to expected values, returned by the\n * {@link #transform(double[], boolean)} (to be implemented by the user: a naive\n * method may be used). Methods are also provided to test that invalid parameters\n * throw the expected exceptions.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SEED"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The common seed of all random number generators used in this test. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.createRealTransformer()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns a new instance of the {@link RealTransformer} to be tested.\n     *\n     * @return a the transformer to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getInvalidDataSize(int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns an invalid data size. Transforms with this data size should\n     * trigger a {@link MathIllegalArgumentException}.\n     *\n     * @param i the index of the invalid data size ({@code 0 \u003c\u003d i \u003c}\n     * {@link #getNumberOfInvalidDataSizes()}\n     * @return an invalid data size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getNumberOfInvalidDataSizes()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the total number of invalid data sizes to be tested. If data\n     * array of any\n     * size can be handled by the {@link RealTransformer} to be tested, this\n     * method should return {@code 0}.\n     *\n     * @return the total number of invalid data sizes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getNumberOfValidDataSizes()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Returns the total number of valid data sizes to be tested.\n     *\n     * @return the total number of valid data sizes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getRelativeTolerance(int)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Returns the expected relative accuracy for data arrays of size\n     * {@code getValidDataSize(i)}.\n     *\n     * @param i the index of the valid data size\n     * @return the expected relative accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getValidDataSize(int)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Returns a valid data size. This method allows for data arrays of various\n     * sizes to be automatically tested (by allowing multiple values of the\n     * specified index).\n     *\n     * @param i the index of the valid data size ({@code 0 \u003c\u003d i \u003c}\n     * {@link #getNumberOfValidDataSizes()}\n     * @return a valid data size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getValidFunction()",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Returns a function for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This function should be valid. In other words, none of the above methods\n     * should throw an exception when passed this function.\n     *\n     * @return a valid function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getValidLowerBound()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns a sampling lower bound for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This lower bound should be valid. In other words, none of the above\n     * methods should throw an exception when passed this bound.\n     *\n     * @return a valid lower bound\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.getValidUpperBound()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Returns a sampling upper bound for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This upper bound should be valid. In other words, none of the above\n     * methods should throw an exception when passed this bound.\n     *\n     * @return a valid bound\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.transform(double[], boolean)",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Returns the expected transform of the specified real data array.\n     *\n     * @param x the real data array to be transformed\n     * @param forward {@code true} (resp. {@code false}) if the forward (resp.\n     * inverse) transform is to be performed\n     * @return the expected transform\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformRealInvalidDataSize()",
      "begin_line": 154,
      "end_line": 166,
      "comment": "\n     * {@link RealTransformer#transform(double[])} should throw a\n     * {@link MathIllegalArgumentException} if data size is invalid.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformFunctionInvalidDataSize()",
      "begin_line": 173,
      "end_line": 188,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * should throw a {@link MathIllegalArgumentException} if number of samples\n     * is invalid.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 68)",
        "(line 176,col 9)-(line 176,col 56)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples()",
      "begin_line": 195,
      "end_line": 210,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * should throw a {@link NotStrictlyPositiveException} if number of samples\n     * is not strictly positive.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 68)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 46)",
        "(line 201,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformFunctionInvalidBounds()",
      "begin_line": 217,
      "end_line": 232,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * should throw a {@link NumberIsTooLargeException} if sampling bounds are\n     * not correctly ordered.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 68)",
        "(line 220,col 9)-(line 220,col 56)",
        "(line 221,col 9)-(line 221,col 46)",
        "(line 222,col 9)-(line 222,col 46)",
        "(line 223,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformRealInvalidDataSize()",
      "begin_line": 238,
      "end_line": 250,
      "comment": "\n     * {@link RealTransformer#inverseTransform(double[])} should throw a\n     * {@link MathIllegalArgumentException} if data size is invalid.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 68)",
        "(line 241,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformFunctionInvalidDataSize()",
      "begin_line": 257,
      "end_line": 272,
      "comment": "\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}\n     * should throw a {@link MathIllegalArgumentException} if number of samples\n     * is invalid.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 68)",
        "(line 260,col 9)-(line 260,col 56)",
        "(line 261,col 9)-(line 261,col 46)",
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformFunctionNotStrictlyPositiveNumberOfSamples()",
      "begin_line": 279,
      "end_line": 295,
      "comment": "\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}\n     * should throw a {@link NotStrictlyPositiveException} if number of samples\n     * is not strictly positive.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 68)",
        "(line 283,col 9)-(line 283,col 56)",
        "(line 284,col 9)-(line 284,col 46)",
        "(line 285,col 9)-(line 285,col 46)",
        "(line 286,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformFunctionInvalidBounds()",
      "begin_line": 302,
      "end_line": 317,
      "comment": "\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}\n     * should throw a {@link NumberIsTooLargeException} if sampling bounds are\n     * not correctly ordered.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 68)",
        "(line 305,col 9)-(line 305,col 56)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformReal()",
      "begin_line": 334,
      "end_line": 341,
      "comment": "\n     * Accuracy check of {@link RealTransformer#transform(double[])}. For each\n     * valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * a random data array is generated with\n     * {@link #createRealData(int) createRealData(i)}. The actual\n     * transform is computed and compared to the expected transform, return by\n     * {@link #transform(double[], boolean)}. Actual and expected values should\n     * be equal to within the relative error returned by\n     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testTransformFunction()",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n     * Accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}.\n     * For each valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * the {@link UnivariateFunction} returned by {@link #getValidFunction()} is\n     * sampled. The actual transform is computed and compared to the expected\n     * transform, return by {@link #transform(double[], boolean)}. Actual and\n     * expected values should be equal to within the relative error returned by\n     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformReal()",
      "begin_line": 374,
      "end_line": 381,
      "comment": "\n     * Accuracy check of {@link RealTransformer#inverseTransform(double[])}. For\n     * each valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * a random data array is generated with\n     * {@link RealTransformerAbstractTest#createRealData(int)}. The actual\n     * transform is computed and compared to the expected transform, return by\n     * {@link #transform(double[], boolean)}. Actual and expected values should\n     * be equal to within the relative error returned by\n     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.testInverseTransformFunction()",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\n     * Accuracy check of\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * For each valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * the {@link UnivariateFunction} returned by {@link #getValidFunction()} is\n     * sampled. The actual transform is computed and compared to the expected\n     * transform, return by {@link #transform(double[], boolean)}. Actual and\n     * expected values should be equal to within the relative error returned by\n     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.createRealData(int)",
      "begin_line": 414,
      "end_line": 421,
      "comment": "\n     * Returns a random array of doubles. Random generator always uses the same\n     * seed.\n     *\n     * @param n the size of the array to be returned\n     * @return a random array of specified size\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 47)",
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.doTestTransformReal(int, double, boolean)",
      "begin_line": 427,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 68)",
        "(line 430,col 9)-(line 430,col 45)",
        "(line 431,col 9)-(line 431,col 56)",
        "(line 432,col 9)-(line 432,col 30)",
        "(line 433,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformerAbstractTest.doTestTransformFunction(int, double, boolean)",
      "begin_line": 445,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 68)",
        "(line 448,col 9)-(line 448,col 56)",
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 450,col 46)",
        "(line 451,col 9)-(line 451,col 45)",
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 56)",
        "(line 457,col 9)-(line 457,col 30)",
        "(line 458,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 467,col 9)"
      ]
    }
  ]
}