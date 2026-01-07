{
  "filepath": "/tmp/Math-47b/src/test/java/org/apache/commons/math/ode/sampling/StepNormalizerOutputTestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizerOutputTestBase",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 15,
      "end_line": 221,
      "comment": " Base class for step normalizer output tests. "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " The normalized output time values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getStart()",
      "begin_line": 25,
      "end_line": 25,
      "comment": "\n     * Returns the start time.\n     * @return the start time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getEnd()",
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * Returns the end time.\n     * @return the end time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpInc()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Returns the expected normalized output time values for increment mode.\n     * @return the expected normalized output time values for increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpIncRev()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * increment mode.\n     * @return the expected reversed normalized output time values for\n     * increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMul()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns the expected normalized output time values for multiples mode.\n     * @return the expected normalized output time values for multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMulRev()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * multiples mode.\n     * @return the expected reversed normalized output time values for\n     * multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getO()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Returns the offsets for the unit tests below, in the order they are\n     * given below. For each test, the left and right offsets are returned.\n     * @return the offsets for the unit tests below, in the order they are\n     * given below\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getArray(double[], int, int)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Get the array, given left and right offsets.\n     * @param a the input array\n     * @param offsetL the left side offset\n     * @param offsetR the right side offset\n     * @return the modified array\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 65)",
        "(line 78,col 9)-(line 78,col 59)",
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeither()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 73)",
        "(line 85,col 9)-(line 85,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 76)",
        "(line 91,col 9)-(line 91,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirst()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 73)",
        "(line 97,col 9)-(line 97,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 76)",
        "(line 103,col 9)-(line 103,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLast()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 73)",
        "(line 109,col 9)-(line 109,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 76)",
        "(line 115,col 9)-(line 115,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBoth()",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 73)",
        "(line 121,col 9)-(line 121,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 76)",
        "(line 127,col 9)-(line 127,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeither()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 76)",
        "(line 139,col 9)-(line 139,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirst()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 75)",
        "(line 145,col 9)-(line 145,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 78)",
        "(line 151,col 9)-(line 151,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLast()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 75)",
        "(line 157,col 9)-(line 157,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev()",
      "begin_line": 160,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 78)",
        "(line 163,col 9)-(line 163,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBoth()",
      "begin_line": 166,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 75)",
        "(line 169,col 9)-(line 169,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev()",
      "begin_line": 172,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 78)",
        "(line 175,col 9)-(line 175,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.doTest(org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds, double[], boolean)",
      "begin_line": 187,
      "end_line": 203,
      "comment": "\n     * The actual step normalizer output test code, shared by all the unit\n     * tests.\n     *\n     * @param mode the step normalizer mode to use\n     * @param bounds the step normalizer bounds setting to use\n     * @param expected the expected output (normalized time points)\n     * @param reverse whether to reverse the integration direction\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 191,col 79)",
        "(line 192,col 9)-(line 192,col 74)",
        "(line 193,col 9)-(line 193,col 29)",
        "(line 194,col 9)-(line 194,col 57)",
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 196,col 47)",
        "(line 197,col 9)-(line 197,col 48)",
        "(line 198,col 9)-(line 198,col 52)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getDimension()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.computeDerivatives(double, double[], double[])",
      "begin_line": 211,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.handleStep(double, double[], double[], boolean)",
      "begin_line": 217,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 22)"
      ]
    }
  ]
}