{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/ode/nonstiff/MultistepStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 36,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.MultistepStepInterpolator()",
      "begin_line": 54,
      "end_line": 57,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link #reinitialize} method should be called before using the\n     * instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases. The {@link MultistepIntegrator} classe uses the\n     * prototyping design pattern to create the step interpolators by\n     * cloning an uninitialized model and latter initializing the copy.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.MultistepStepInterpolator(org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator)",
      "begin_line": 76,
      "end_line": 92,
      "comment": " Copy constructor.\n\n     * \u003cp\u003eThe copied interpolator should have been finalized before the\n     * copy, otherwise the copy will not be able to perform correctly any\n     * interpolation and will throw a {@link NullPointerException}\n     * later. Since we don\u0027t want this constructor to throw the\n     * exceptions finalization may involve and since we don\u0027t want this\n     * method to modify the state of the copied interpolator,\n     * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n     * remains under user control.\u003c/p\u003e\n\n     * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n     * original arrays of the instance.\u003c/p\u003e\n\n     * @param interpolator interpolator to copy from.\n\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 28)",
        "(line 80,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.reinitialize(double[], double[], double[][], boolean)",
      "begin_line": 103,
      "end_line": 110,
      "comment": " Reinitialize the instance\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param previousT reference to the integrator array holding the times\n     * of the previous steps\n     * @param previousF reference to the integrator array holding the\n     * previous slopes\n     * @param forward integration direction indicator\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 108,col 9)-(line 108,col 35)",
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.initializeCoefficients()",
      "begin_line": 114,
      "end_line": 114,
      "comment": " Initialize the coefficients arrays.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 117,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 31)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 125,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 135,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 46)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 144,col 39)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    }
  ]
}