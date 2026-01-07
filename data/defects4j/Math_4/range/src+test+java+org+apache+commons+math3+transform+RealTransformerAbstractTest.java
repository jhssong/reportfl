{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/transform/RealTransformerAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealTransformerAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 351,
      "comment": "\n * Abstract test for classes implementing the {@link RealTransformer} interface.\n * This abstract test handles the automatic generation of random data of various\n * sizes. For each generated data array, actual values (returned by the\n * transformer to be tested) are compared to expected values, returned by the\n * {@link #transform(double[], TransformType)} (to be implemented by the user:\n * a naive method may be used). Methods are also provided to test that invalid\n * parameters throw the expected exceptions.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.createRealTransformer()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns a new instance of the {@link RealTransformer} to be tested.\n     *\n     * @return a the transformer to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getInvalidDataSize(int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns an invalid data size. Transforms with this data size should\n     * trigger a {@link MathIllegalArgumentException}.\n     *\n     * @param i the index of the invalid data size ({@code 0 \u003c\u003d i \u003c}\n     * {@link #getNumberOfInvalidDataSizes()}\n     * @return an invalid data size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getNumberOfInvalidDataSizes()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the total number of invalid data sizes to be tested. If data\n     * array of any\n     * size can be handled by the {@link RealTransformer} to be tested, this\n     * method should return {@code 0}.\n     *\n     * @return the total number of invalid data sizes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getNumberOfValidDataSizes()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Returns the total number of valid data sizes to be tested.\n     *\n     * @return the total number of valid data sizes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getRelativeTolerance(int)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Returns the expected relative accuracy for data arrays of size\n     * {@code getValidDataSize(i)}.\n     *\n     * @param i the index of the valid data size\n     * @return the expected relative accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getValidDataSize(int)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Returns a valid data size. This method allows for data arrays of various\n     * sizes to be automatically tested (by allowing multiple values of the\n     * specified index).\n     *\n     * @param i the index of the valid data size ({@code 0 \u003c\u003d i \u003c}\n     * {@link #getNumberOfValidDataSizes()}\n     * @return a valid data size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getValidFunction()",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Returns a function for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This function should be valid. In other words, none of the above methods\n     * should throw an exception when passed this function.\n     *\n     * @return a valid function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getValidLowerBound()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns a sampling lower bound for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This lower bound should be valid. In other words, none of the above\n     * methods should throw an exception when passed this bound.\n     *\n     * @return a valid lower bound\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.getValidUpperBound()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Returns a sampling upper bound for the accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}\n     * and\n     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.\n     * This upper bound should be valid. In other words, none of the above\n     * methods should throw an exception when passed this bound.\n     *\n     * @return a valid bound\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Returns the expected transform of the specified real data array.\n     *\n     * @param x the real data array to be transformed\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the expected transform\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformRealInvalidDataSize()",
      "begin_line": 153,
      "end_line": 168,
      "comment": "\n     * {@link RealTransformer#transform(double[], TransformType)} should throw a\n     * {@link MathIllegalArgumentException} if data size is invalid.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 60)",
        "(line 156,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionInvalidDataSize()",
      "begin_line": 175,
      "end_line": 193,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}\n     * should throw a {@link MathIllegalArgumentException} if number of samples\n     * is invalid.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 60)",
        "(line 178,col 9)-(line 178,col 68)",
        "(line 179,col 9)-(line 179,col 56)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples()",
      "begin_line": 200,
      "end_line": 218,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}\n     * should throw a {@link NotStrictlyPositiveException} if number of samples\n     * is not strictly positive.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 60)",
        "(line 203,col 9)-(line 203,col 68)",
        "(line 204,col 9)-(line 204,col 56)",
        "(line 205,col 9)-(line 205,col 46)",
        "(line 206,col 9)-(line 206,col 46)",
        "(line 207,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionInvalidBounds()",
      "begin_line": 225,
      "end_line": 243,
      "comment": "\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}\n     * should throw a {@link NumberIsTooLargeException} if sampling bounds are\n     * not correctly ordered.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 60)",
        "(line 228,col 9)-(line 228,col 68)",
        "(line 229,col 9)-(line 229,col 56)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformReal()",
      "begin_line": 260,
      "end_line": 270,
      "comment": "\n     * Accuracy check of {@link RealTransformer#transform(double[], TransformType)}.\n     * For each valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * a random data array is generated with\n     * {@link #createRealData(int) createRealData(i)}. The actual\n     * transform is computed and compared to the expected transform, return by\n     * {@link #transform(double[], TransformType)}. Actual and expected values\n     * should be equal to within the relative error returned by\n     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunction()",
      "begin_line": 283,
      "end_line": 293,
      "comment": "\n     * Accuracy check of\n     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}.\n     * For each valid data size returned by\n     * {@link #getValidDataSize(int) getValidDataSize(i)},\n     * the {@link UnivariateFunction} returned by {@link #getValidFunction()} is\n     * sampled. The actual transform is computed and compared to the expected\n     * transform, return by {@link #transform(double[], TransformType)}. Actual\n     * and expected values should be equal to within the relative error returned\n     * by {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 60)",
        "(line 286,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.createRealData(int)",
      "begin_line": 306,
      "end_line": 313,
      "comment": "\n     * Returns a random array of doubles. Random generator always uses the same\n     * seed.\n     *\n     * @param n the size of the array to be returned\n     * @return a random array of specified size\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 308,col 44)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.doTestTransformReal(int, double, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 319,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 68)",
        "(line 322,col 9)-(line 322,col 45)",
        "(line 323,col 9)-(line 323,col 53)",
        "(line 324,col 9)-(line 324,col 63)",
        "(line 325,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformerAbstractTest.doTestTransformFunction(int, double, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 332,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 68)",
        "(line 335,col 9)-(line 335,col 56)",
        "(line 336,col 9)-(line 336,col 46)",
        "(line 337,col 9)-(line 337,col 46)",
        "(line 338,col 9)-(line 338,col 45)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 53)",
        "(line 344,col 9)-(line 344,col 72)",
        "(line 345,col 9)-(line 349,col 9)"
      ]
    }
  ]
}