{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/JacobianMatrices.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobianMatrices",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 493,
      "comment": "\n * This class defines a set of {@link SecondaryEquations secondary equations} to\n * compute the Jacobian matrices with respect to the initial state vector and, if\n * any, to some parameters of the primary ODE set.\n * \u003cp\u003e\n * It is intended to be packed into an {@link ExpandableStatefulODE}\n * in conjunction with a primary set of ODE, which may be:\n * \u003cul\u003e\n * \u003cli\u003ea {@link FirstOrderDifferentialEquations}\u003c/li\u003e\n * \u003cli\u003ea {@link MainStateJacobianProvider}\u003c/li\u003e\n * \u003c/ul\u003e\n * In order to compute Jacobian matrices with respect to some parameters of the\n * primary ODE set, the following parameter Jacobian providers may be set:\n * \u003cul\u003e\n * \u003cli\u003ea {@link ParameterJacobianProvider}\u003c/li\u003e\n * \u003cli\u003ea {@link ParameterizedODE}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see ExpandableStatefulODE\n * @see FirstOrderDifferentialEquations\n * @see MainStateJacobianProvider\n * @see ParameterJacobianProvider\n * @see ParameterizedODE\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "efode"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Expandable first order differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Index of the instance in the expandable set. "
    },
    {
      "type": "field",
      "varNames": [
        "jode"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " FODE with exact primary Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " FODE without exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDim"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Main state vector dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "selectedParameters"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Selected parameters for parameter Jacobian computation. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianProviders"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " FODE with exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "paramDim"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Parameters dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyParameter"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Boolean for selected parameters consistency. "
    },
    {
      "type": "field",
      "varNames": [
        "matricesData"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " State and parameters Jacobian matrices in a row. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[], java.lang.String...)",
      "begin_line": 104,
      "end_line": 108,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param fode the primary first order differential equations set to extend\n     * @param hY step used for finite difference computation with respect to state vector\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     * @exception DimensionMismatchException if there is a dimension mismatch between\n     * the steps array {@code hY} and the equation dimension\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.MainStateJacobianProvider, java.lang.String...)",
      "begin_line": 122,
      "end_line": 154,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param jode the primary first order differential equations set to extend\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 128,col 9)-(line 128,col 25)",
        "(line 129,col 9)-(line 129,col 25)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 133,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 145,col 9)-(line 145,col 76)",
        "(line 149,col 9)-(line 149,col 68)",
        "(line 150,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.registerVariationalEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)",
      "begin_line": 164,
      "end_line": 179,
      "comment": " Register the variational equations for the Jacobians matrices to the expandable set.\n     * @param expandable expandable set into which variational equations should be registered\n     * @throws DimensionMismatchException if the dimension of the partial state does not\n     * match the selected equations set dimension\n     * @exception MismatchedEquations if the primary set of the expandable set does\n     * not match the one used to build the instance\n     * @see ExpandableStatefulODE#addSecondaryEquations(SecondaryEquations)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 57)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 176,col 79)",
        "(line 177,col 9)-(line 177,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.addParameterJacobianProvider(org.apache.commons.math3.ode.ParameterJacobianProvider)",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Add a parameter Jacobian provider.\n     * @param provider the parameter Jacobian provider to compute exactly the parameter Jacobian matrix\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterizedODE(org.apache.commons.math3.ode.ParameterizedODE)",
      "begin_line": 191,
      "end_line": 194,
      "comment": " Set a parameter Jacobian provider.\n     * @param parameterizedOde the parameterized ODE to compute the parameter Jacobian matrix using finite differences\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)",
        "(line 193,col 9)-(line 193,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterStep(java.lang.String, double)",
      "begin_line": 213,
      "end_line": 226,
      "comment": " Set the step associated to a parameter in order to compute by finite\n     *  difference the Jacobian matrix.\n     * \u003cp\u003e\n     * Needed if and only if the primary ODE set is a {@link ParameterizedODE}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Given a non zero parameter value pval for the parameter, a reasonable value\n     * for such a step is {@code pval * FastMath.sqrt(Precision.EPSILON)}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * A zero value for such a step doesn\u0027t enable to compute the parameter Jacobian matrix.\n     * \u003c/p\u003e\n     * @param parameter parameter to consider for Jacobian processing\n     * @param hP step for Jacobian finite difference computation w.r.t. the specified parameter\n     * @see ParameterizedODE\n     * @exception UnknownParameterException if the parameter is not supported\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialMainStateJacobian(double[][])",
      "begin_line": 236,
      "end_line": 254,
      "comment": " Set the initial value of the Jacobian matrix with respect to state.\n     * \u003cp\u003e\n     * If this method is not called, the initial value of the Jacobian\n     * matrix with respect to state is set to identity.\n     * \u003c/p\u003e\n     * @param dYdY0 initial Jacobian matrix w.r.t. state\n     * @exception DimensionMismatchException if matrix dimensions are incorrect\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 43)",
        "(line 244,col 9)-(line 244,col 18)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialParameterJacobian(java.lang.String, double[])",
      "begin_line": 266,
      "end_line": 287,
      "comment": " Set the initial value of a column of the Jacobian matrix with respect to one parameter.\n     * \u003cp\u003e\n     * If this method is not called for some parameter, the initial value of\n     * the column of the Jacobian matrix with respect to this parameter is set to zero.\n     * \u003c/p\u003e\n     * @param pName parameter name\n     * @param dYdP initial Jacobian column vector with respect to the parameter\n     * @exception UnknownParameterException if a parameter is not supported\n     * @throws DimensionMismatchException if the column vector does not match state dimension\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 39)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentMainSetJacobian(double[][])",
      "begin_line": 292,
      "end_line": 303,
      "comment": " Get the current value of the Jacobian matrix with respect to state.\n     * @param dYdY0 current Jacobian matrix with respect to state.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 52)",
        "(line 297,col 9)-(line 297,col 18)",
        "(line 298,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentParameterJacobian(java.lang.String, double[])",
      "begin_line": 309,
      "end_line": 323,
      "comment": " Get the current value of the Jacobian matrix with respect to one parameter.\n     * @param pName name of the parameter for the computed Jacobian matrix\n     * @param dYdP current Jacobian matrix with respect to the named parameter\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 52)",
        "(line 314,col 9)-(line 314,col 36)",
        "(line 315,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.checkDimension(int, java.lang.Object)",
      "begin_line": 330,
      "end_line": 336,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws DimensionMismatchException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 74)",
        "(line 333,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JacobiansSecondaryEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.SecondaryEquations"
      ],
      "begin_line": 344,
      "end_line": 416,
      "comment": " Local implementation of secondary equations.\n     * \u003cp\u003e\n     * This class is an inner class to ensure proper scheduling of calls\n     * by forcing the use of {@link JacobianMatrices#registerVariationalEquations(ExpandableStatefulODE)}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.getDimension()",
      "begin_line": 347,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.computeDerivatives(double, double[], double[], double[], double[])",
      "begin_line": 352,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 13)-(line 360,col 13)",
        "(line 366,col 13)-(line 366,col 61)",
        "(line 367,col 13)-(line 367,col 60)",
        "(line 370,col 13)-(line 382,col 13)",
        "(line 384,col 13)-(line 413,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MainStateJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.MainStateJacobianProvider"
      ],
      "begin_line": 421,
      "end_line": 475,
      "comment": " Wrapper class to compute jacobian matrices by finite differences for ODE\n     *  which do not compute them by themselves.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " Raw ODE without jacobians computation skill to be wrapped into a MainStateJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": " Steps for finite difference computation of the jacobian df/dy w.r.t. state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.MainStateJacobianWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[])",
      "begin_line": 436,
      "end_line": 444,
      "comment": " Wrap a {@link FirstOrderDifferentialEquations} into a {@link MainStateJacobianProvider}.\n         * @param ode original ODE problem, without jacobians computation skill\n         * @param hY step sizes to compute the jacobian df/dy\n         * @see JacobianMatrices#setMainStateSteps(double[])\n         * @exception DimensionMismatchException if there is a dimension mismatch between\n         * the steps array {@code hY} and the equation dimension\n         ",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 27)",
        "(line 440,col 13)-(line 440,col 33)",
        "(line 441,col 13)-(line 443,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.getDimension()",
      "begin_line": 447,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 452,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeMainStateJacobian(double, double[], double[], double[][])",
      "begin_line": 458,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 13)-(line 461,col 45)",
        "(line 462,col 13)-(line 462,col 50)",
        "(line 464,col 13)-(line 472,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MismatchedEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 481,
      "end_line": 491,
      "comment": "\n     * Special exception for equations mismatch.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": " Serializable UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MismatchedEquations.MismatchedEquations()",
      "begin_line": 487,
      "end_line": 489,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 66)"
      ]
    }
  ]
}