{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/sampling/StepNormalizerOutputTestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizerOutputTestBase",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderDifferentialEquations",
        "org.apache.commons.math3.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 35,
      "end_line": 282,
      "comment": " Base class for step normalizer output tests. "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The normalized output time values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getStart()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the start time.\n     * @return the start time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getEnd()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns the end time.\n     * @return the end time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpInc()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Returns the expected normalized output time values for increment mode.\n     * @return the expected normalized output time values for increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpIncRev()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * increment mode.\n     * @return the expected reversed normalized output time values for\n     * increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpMul()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the expected normalized output time values for multiples mode.\n     * @return the expected normalized output time values for multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpMulRev()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * multiples mode.\n     * @return the expected reversed normalized output time values for\n     * multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getO()",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Returns the offsets for the unit tests below, in the order they are\n     * given below. For each test, the left and right offsets are returned.\n     * @return the offsets for the unit tests below, in the order they are\n     * given below\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getArray(double[], int, int)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Get the array, given left and right offsets.\n     * @param a the input array\n     * @param offsetL the left side offset\n     * @param offsetR the right side offset\n     * @return the modified array\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 65)",
        "(line 98,col 9)-(line 98,col 59)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeither()",
      "begin_line": 102,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 73)",
        "(line 107,col 9)-(line 107,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 76)",
        "(line 115,col 9)-(line 115,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirst()",
      "begin_line": 118,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 73)",
        "(line 123,col 9)-(line 123,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 76)",
        "(line 131,col 9)-(line 131,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLast()",
      "begin_line": 134,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 73)",
        "(line 139,col 9)-(line 139,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev()",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 76)",
        "(line 147,col 9)-(line 147,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBoth()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 73)",
        "(line 155,col 9)-(line 155,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 76)",
        "(line 163,col 9)-(line 163,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeither()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 73)",
        "(line 171,col 9)-(line 171,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev()",
      "begin_line": 174,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 76)",
        "(line 179,col 9)-(line 179,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirst()",
      "begin_line": 182,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 75)",
        "(line 187,col 9)-(line 187,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev()",
      "begin_line": 190,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 78)",
        "(line 195,col 9)-(line 195,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLast()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 75)",
        "(line 203,col 9)-(line 203,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 78)",
        "(line 211,col 9)-(line 211,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBoth()",
      "begin_line": 214,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 75)",
        "(line 219,col 9)-(line 219,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev()",
      "begin_line": 222,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 78)",
        "(line 227,col 9)-(line 227,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.doTest(org.apache.commons.math3.ode.sampling.StepNormalizerMode, org.apache.commons.math3.ode.sampling.StepNormalizerBounds, double[], boolean)",
      "begin_line": 243,
      "end_line": 261,
      "comment": "\n     * The actual step normalizer output test code, shared by all the unit\n     * tests.\n     *\n     * @param mode the step normalizer mode to use\n     * @param bounds the step normalizer bounds setting to use\n     * @param expected the expected output (normalized time points)\n     * @param reverse whether to reverse the integration direction\n     * @throws NoBracketingException \n     * @throws MaxCountExceededException \n     * @throws NumberIsTooSmallException \n     * @throws DimensionMismatchException \n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 249,col 79)",
        "(line 250,col 9)-(line 250,col 74)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 57)",
        "(line 253,col 9)-(line 253,col 55)",
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 48)",
        "(line 256,col 9)-(line 256,col 52)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getDimension()",
      "begin_line": 264,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.computeDerivatives(double, double[], double[])",
      "begin_line": 269,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.init(double, double[], double)",
      "begin_line": 274,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.handleStep(double, double[], double[], boolean)",
      "begin_line": 278,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 22)"
      ]
    }
  ]
}