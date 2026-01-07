{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/ode/nonstiff/MultistepStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 37,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.MultistepStepInterpolator()",
      "begin_line": 55,
      "end_line": 58,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link #reinitialize} method should be called before using the\n     * instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases. The {@link MultistepIntegrator} classe uses the\n     * prototyping design pattern to create the step interpolators by\n     * cloning an uninitialized model and latter initializing the copy.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.MultistepStepInterpolator(org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator)",
      "begin_line": 77,
      "end_line": 93,
      "comment": " Copy constructor.\n\n     * \u003cp\u003eThe copied interpolator should have been finalized before the\n     * copy, otherwise the copy will not be able to perform correctly any\n     * interpolation and will throw a {@link NullPointerException}\n     * later. Since we don\u0027t want this constructor to throw the\n     * exceptions finalization may involve and since we don\u0027t want this\n     * method to modify the state of the copied interpolator,\n     * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n     * remains under user control.\u003c/p\u003e\n\n     * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n     * original arrays of the instance.\u003c/p\u003e\n\n     * @param interpolator interpolator to copy from.\n\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 28)",
        "(line 81,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.reinitialize(double[], double[], double[][], boolean)",
      "begin_line": 104,
      "end_line": 111,
      "comment": " Reinitialize the instance\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param previousT reference to the integrator array holding the times\n     * of the previous steps\n     * @param previousF reference to the integrator array holding the\n     * previous slopes\n     * @param forward integration direction indicator\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 35)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.initializeCoefficients()",
      "begin_line": 115,
      "end_line": 115,
      "comment": " Initialize the coefficients arrays.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 118,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 31)",
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 136,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 46)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 37)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    }
  ]
}