{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/ode/nonstiff/AdamsMoultonStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsMoultonStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "neville"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Neville\u0027s interpolation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rollback"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Integration rollback array. "
    },
    {
      "type": "field",
      "varNames": [
        "gammaStar"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " \u0026gamma; star array. "
    },
    {
      "type": "field",
      "varNames": [
        "bdArray"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Backward differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "nonTruncatedEnd"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Original non-truncated step end time. "
    },
    {
      "type": "field",
      "varNames": [
        "nonTruncatedH"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Original non-truncated step size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.AdamsMoultonStepInterpolator()",
      "begin_line": 78,
      "end_line": 79,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link AbstractStepInterpolator#reinitialize} method should be called\n     * before using the instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.AdamsMoultonStepInterpolator(org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator)",
      "begin_line": 86,
      "end_line": 90,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 28)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.doCopy()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.initializeCoefficients()",
      "begin_line": 98,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 48)",
        "(line 101,col 9)-(line 101,col 48)",
        "(line 103,col 9)-(line 103,col 93)",
        "(line 105,col 9)-(line 105,col 95)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.storeTime(double)",
      "begin_line": 114,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 117,col 9)-(line 117,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.truncateStep(double)",
      "begin_line": 125,
      "end_line": 128,
      "comment": " Truncate a step.\n     * \u003cp\u003eTruncating a step is necessary when an event is triggered\n     * before the nominal end of the step.\u003c/p\u003e\n     * @param truncatedEndTime end time of truncated step\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 131,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 73)",
        "(line 135,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 137,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.interpolateDerivatives()",
      "begin_line": 152,
      "end_line": 176,
      "comment": " Interpolate the derivatives.\n     * \u003cp\u003eThe Adams method is based on a polynomial interpolation of the\n     * derivatives based on the preceding steps. So the interpolation of\n     * the derivatives here is strictly equivalent: it is a simple polynomial\n     * interpolation.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.interpolateState(double)",
      "begin_line": 226,
      "end_line": 240,
      "comment": " Interpolate the state.\n     * \u003cp\u003eThe Adams method is based on a polynomial interpolation of the\n     * derivatives based on the preceding steps. The polynomial model is\n     * integrated analytically throughout the last step. Using the notations\n     * found in the second edition of the first volume (Nonstiff Problems)\n     * of the reference book by Hairer, Norsett and Wanner: \u003ci\u003eSolving Ordinary\n     * Differential Equations\u003c/i\u003e (Springer-Verlag, ISBN 3-540-56670-8), this\n     * process leads to the following expression:\u003c/p\u003e\n     * \u003cpre\u003e\n     * y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e +\n     * h \u0026times; \u0026sum;\u003csub\u003ej\u003d0\u003c/sub\u003e\u003csup\u003ej\u003dk\u003c/sup\u003e \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e\u0026nabla;\u003csup\u003ej\u003c/sup\u003ef\u003csub\u003en+1\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003eIn the previous expression, the \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e terms are the\n     * ones that result from the analytical integration, and can be computed form\n     * the binomial coefficients C\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e-s\u003c/sup\u003e:\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e \u003d (-1)\u003csup\u003ej\u003c/sup\u003e\u0026int;\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e1\u003c/sup\u003eC\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e1-s\u003c/sup\u003eds\n     * \u003c/p\u003e\n     * \u003cp\u003eIn order to interpolate the state in a manner that is consistent with the\n     * integration scheme, we simply subtract from the current state (at the end of the step)\n     * the integral computed from interpolation time to step end time.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026eta;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;)\u003d\n     * (-1)\u003csup\u003ej\u003c/sup\u003e\u0026int;\u003csub\u003e\u0026theta;\u003c/sub\u003e\u003csup\u003e1\u003c/sup\u003eC\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e1-s\u003c/sup\u003eds\n     * \u003c/p\u003e\n     * The method described in the Hairer, Norsett and Wanner book to compute \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e\n     * is easily extended to compute \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;)\u003d\n     * (-1)\u003csup\u003ej\u003c/sup\u003e\u0026int;\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026theta;\u003c/sup\u003eC\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e1-s\u003c/sup\u003eds. From this,\n     * we can compute \u0026eta;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;) \u003d\n     * \u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e-\u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;).\n     * The first few values are:\u003c/p\u003e\n     * \u003ctable\u003e\n     * \u003ctr\u003e\u003ctd\u003ej\u003c/td\u003e\u003ctd\u003e\u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e\u003c/td\u003e\u003ctd\u003e\u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;)\u003c/td\u003e\u003ctd\u003e\u0026eta;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;)\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e0\u003c/td\u003e\u003ctd\u003e1\u003c/td\u003e\u003ctd\u003e\u0026theta;\u003c/td\u003e\u003ctd\u003e1-\u0026theta;\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e1\u003c/td\u003e\u003ctd\u003e-1/2\u003c/td\u003e\u003ctd\u003e(\u0026theta;\u003csup\u003e2\u003c/sup\u003e-2\u0026theta;)/2\u003c/td\u003e\u003ctd\u003e(-1+2\u0026theta;-\u0026theta;\u003csup\u003e2\u003c/sup\u003e)/2\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e2\u003c/td\u003e\u003ctd\u003e-1/12\u003c/td\u003e\u003ctd\u003e(2\u0026theta;\u003csup\u003e3\u003c/sup\u003e-3\u0026theta;\u003csup\u003e2\u003c/sup\u003e)/12\u003c/td\u003e\u003ctd\u003e(-1+3\u0026theta;\u003csup\u003e2\u003c/sup\u003e-2\u0026theta;\u003csup\u003e3\u003c/sup\u003e)/12\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     * \u003cp\u003e\n     * The \u0026eta;\u003csub\u003ej\u003c/sub\u003e(\u0026theta;) functions appear to be polynomial ones. As expected,\n     * we see that \u0026eta;\u003csub\u003ej\u003c/sub\u003e(1)\u003d 0. The recurrence relation derived for\n     * \u0026gamma;\u003csub\u003ej\u003c/sub\u003e(\u0026theta;) is:\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u0026sum\u003csub\u003ej\u003d0\u003c/sub\u003e\u003csup\u003ej\u003dm\u003c/sup\u003e\u0026gamma;\u003csub\u003ej\u003c/sub\u003e\u003csup\u003e*\u003c/sup\u003e(\u0026theta;)/(m+1-j) \u003d\n     * 1/(m+1)! \u0026prod;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003ek\u003dm\u003c/sup\u003e(\u0026theta;+k-1)\n     * \u003c/p\u003e\n     * @param theta location of the interpolation point within the last step\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 53)",
        "(line 232,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.computeRollback(int, double)",
      "begin_line": 246,
      "end_line": 275,
      "comment": " Compute the rollback coefficients.\n     * @param order order of the integration method\n     * @param theta current value for theta\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 35)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 267,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 278,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 285,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 42)"
      ]
    }
  ]
}