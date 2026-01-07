{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/FirstOrderIntegratorFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegratorFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 297,
      "comment": "\n * Abstract factory class used to create {@link FirstOrderIntegrator} instances.\n * \u003cp\u003e\n * Integrators implementing the following fixed stepsize algorithms are supported:\n * \u003cul\u003e\n * \u003cli\u003eEuler\u003c/li\u003e\n * \u003cli\u003emidpoint\u003c/li\u003e\n * \u003cli\u003eclassical Runge-Kutta\u003c/li\u003e\n * \u003cli\u003eGill\u003c/li\u003e\n * \u003cli\u003e3/8\u003c/li\u003e\n * \u003c/ul\u003e\n * Concrete factories extending this class also specify a default fixed stepsize integrator,\n * instances of which are returned by \u003ccode\u003enewDefaultFixedStepsizeIntegrator\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cp\u003e\n * Integrators implementing the following adaptive stepsize algorithms are supported:\n * \u003cul\u003e\n * \u003cli\u003eHigham-Hall\u003c/li\u003e\n * \u003cli\u003eDormand-Prince 5(4)\u003c/li\u003e\n * \u003cli\u003eDormand-Pince 8(5,3)\u003c/li\u003e\n * \u003cli\u003eGragg-Bulirsch-Stoer\u003c/li\u003e\n * \u003c/ul\u003e\n * Concrete factories extending this class also specify default adaptive stepsize integrators,\n * instances of which are returned by the two \u003ccode\u003enewDefaultAdaptiveStepsizeIntegrator\u003c/code\u003e\n * methods.\n * \u003cp\u003e\n * Common usage:\u003cpre\u003e\n * FirstOrderIntegratorFactory factory \u003d FirstOrderIntegratorFactory.newInstance();\n *\n * // create a Dormand-Prince 8(5,3) integrator to use with some step control parameters\n * AdaptiveStepsizeIntegrator integrator \u003d\n *   factory.newDormandPrince853Integrator(minStep, maxStep,\n *                                         scalAbsoluteTolerance,\n *                                         scalRelativeTolerance);\n * \u003c/pre\u003e\n *\n * \u003ca href\u003d\"http://jakarta.apache.org/commons/discovery/\"\u003eJakarta Commons Discovery\u003c/a\u003e\n * is used to determine the concrete factory returned by \n * \u003ccode\u003eFirstOrderIntegratorFactory.newInstance().\u003c/code\u003e  The default is\n * {@link FirstOrderIntegratorFactoryImpl}\n *\n * @version $Revision: 480440 $ $Date: 2006-11-29 08:14:12 +0100 (mer., 29 nov. 2006) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.FirstOrderIntegratorFactory()",
      "begin_line": 69,
      "end_line": 70,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newInstance()",
      "begin_line": 76,
      "end_line": 87,
      "comment": "\n     * Create a new factory.\n     * @return a new factory\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDefaultFixedStepsizeIntegrator(double)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * The actual integrator returned is determined by the underlying factory.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDefaultAdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The actual integrator returned is determined by the underlying factory.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDefaultAdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The actual integrator returned is determined by the underlying factory.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newEulerIntegrator(double)",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Create a new {@link FirstOrderIntegrator}.\n     * The integrator is an implementation of the Euler method.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newMidpointIntegrator(double)",
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Create a new {@link FirstOrderIntegrator}.\n     * The integrator is an implementation of the midpoint method.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newClassicalRungeKuttaIntegrator(double)",
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Create a new {@link FirstOrderIntegrator}.\n     * The integrator is an implementation of the classical Runge-Kutta method.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newGillIntegrator(double)",
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Create a new {@link FirstOrderIntegrator}.\n     * The integrator is an implementation of the Gill method.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newThreeEighthesIntegrator(double)",
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * Create a new {@link FirstOrderIntegrator}.\n     * The integrator is an implementation of the 3/8 method.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newHighamHall54Integrator(double, double, double, double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Higham-Hall method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newHighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Higham-Hall method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDormandPrince54Integrator(double, double, double, double)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Dormand-Prince 5(4) method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Dormand-Prince 5(4) method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDormandPrince853Integrator(double, double, double, double)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Dormand-Prince 8(5,3) method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newDormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Dormand-Prince 8(5,3) method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newGraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Gragg-Burlisch-Stoer method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactory.newGraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * The integrator is an implementation of the Gragg-Burlisch-Stoer method.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": []
    }
  ]
}