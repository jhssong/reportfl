{
  "filepath": "/tmp/Math-52b/src/test/java/org/apache/commons/math/ode/sampling/StepNormalizerOutputTestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizerOutputTestBase",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 16,
      "end_line": 224,
      "comment": " Base class for step normalizer output tests. "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " The normalized output time values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getStart()",
      "begin_line": 26,
      "end_line": 26,
      "comment": "\n     * Returns the start time.\n     * @return the start time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getEnd()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Returns the end time.\n     * @return the end time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpInc()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Returns the expected normalized output time values for increment mode.\n     * @return the expected normalized output time values for increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpIncRev()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * increment mode.\n     * @return the expected reversed normalized output time values for\n     * increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMul()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns the expected normalized output time values for multiples mode.\n     * @return the expected normalized output time values for multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMulRev()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * multiples mode.\n     * @return the expected reversed normalized output time values for\n     * multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getO()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns the offsets for the unit tests below, in the order they are\n     * given below. For each test, the left and right offsets are returned.\n     * @return the offsets for the unit tests below, in the order they are\n     * given below\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getArray(double[], int, int)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Get the array, given left and right offsets.\n     * @param a the input array\n     * @param offsetL the left side offset\n     * @param offsetR the right side offset\n     * @return the modified array\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 65)",
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeither()",
      "begin_line": 83,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 73)",
        "(line 86,col 9)-(line 86,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 76)",
        "(line 92,col 9)-(line 92,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirst()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 98,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 76)",
        "(line 104,col 9)-(line 104,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLast()",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 73)",
        "(line 110,col 9)-(line 110,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 76)",
        "(line 116,col 9)-(line 116,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBoth()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 73)",
        "(line 122,col 9)-(line 122,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 76)",
        "(line 128,col 9)-(line 128,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeither()",
      "begin_line": 131,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 73)",
        "(line 134,col 9)-(line 134,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 76)",
        "(line 140,col 9)-(line 140,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirst()",
      "begin_line": 143,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 75)",
        "(line 146,col 9)-(line 146,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 78)",
        "(line 152,col 9)-(line 152,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLast()",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 75)",
        "(line 158,col 9)-(line 158,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev()",
      "begin_line": 161,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 78)",
        "(line 164,col 9)-(line 164,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBoth()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 170,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev()",
      "begin_line": 173,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 78)",
        "(line 176,col 9)-(line 176,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.doTest(org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds, double[], boolean)",
      "begin_line": 188,
      "end_line": 206,
      "comment": "\n     * The actual step normalizer output test code, shared by all the unit\n     * tests.\n     *\n     * @param mode the step normalizer mode to use\n     * @param bounds the step normalizer bounds setting to use\n     * @param expected the expected output (normalized time points)\n     * @param reverse whether to reverse the integration direction\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 194,col 79)",
        "(line 195,col 9)-(line 195,col 74)",
        "(line 196,col 9)-(line 196,col 29)",
        "(line 197,col 9)-(line 197,col 57)",
        "(line 198,col 9)-(line 198,col 55)",
        "(line 199,col 9)-(line 199,col 47)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 201,col 52)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getDimension()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.computeDerivatives(double, double[], double[])",
      "begin_line": 214,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.handleStep(double, double[], double[], boolean)",
      "begin_line": 220,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 22)"
      ]
    }
  ]
}