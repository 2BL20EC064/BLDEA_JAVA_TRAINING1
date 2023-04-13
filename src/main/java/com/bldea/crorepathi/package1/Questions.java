package com.bldea.crorepathi.package1;
import java.util.Scanner;
public class Questions {
	static String result;
	static String result2;
	static int count_life_line=3;
	static int aud_phn=1; 
	static int cnt_50_50 = 1;
	static int skip_cnt=1;
	static Scanner sc = new Scanner(System.in); 
			public static boolean fetchQuestions1(String name)  {
			System.out.println("1. Who is the founder of Java?");
			System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
					+ "e) life line");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				candidate.setAmount(1000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
						
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println(  );
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(1000);
						return true;
					}
				}

			}


			return false;
		}

		public static boolean fetchQuestions2(String name) {
			System.out.println("2.Compiler is?");
			System.out.println("a)software\n"+
			                   "b)hardware\n"+
					           "c)both a and b\n"+
			                   "d)none of these\n"+
					           "e)life line");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				candidate.setAmount(2000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							
							System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)software\n"+
							                   "b)hardware");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(2000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a)software"+ "b)hardware");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)software"+ "b)hardware");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn=0;
								
									System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(2000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
										
											System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(2000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
								
									System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a)software\n"+
									                   "b)hardware\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)software\n"+
							                   "b)hardware\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4  = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											
											System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a)software\n"+
									                   "b)hardware\n"+
											           "c)both a and b\n"+
									                   "d)none of these\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a)software\n"+
			                   "b)hardware\n"+
					           "c)both a and b\n"+
			                   "d)none of these\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(2000);
						return true;
					}
				}

			}


			return false;
		}
	

public static boolean fetchQuestions3(String name) {
	System.out.println("3.Data stored on Ram is?");
	System.out.println("a)file\n"+
                       "b)register\n"+
	                   "c)byte\n"+
                       "d)none of the above\n"+
	                   "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		candidate.setAmount(3000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
	
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 98%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(3000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)register\n"+
							                    "c)byte\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(3000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(3000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
						                               "b)register\n"+
							                           "c)byte\n"+
						                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(3000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)register\n"+
						                               "c)byte\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
				                               "b)register\n"+
					                           "c)byte\n"+
				                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b)register\n"+
                            "c)byte\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(3000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 98%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(3000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(3000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
				                               "b)register\n"+
					                           "c)byte\n"+
				                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(3000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
						
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 98%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
				                               "b)register\n"+
					                           "c)byte\n"+
				                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(2000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 98%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(3000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)register\n"+
				                            "c)byte\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
				                               "b)register\n"+
					                           "c)byte\n"+
				                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)register\n"+
			                           "c)byte\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(3000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
								
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c =98%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)file\n"+
				                               "b)register\n"+
					                           "c)byte\n"+
				                               "d)none of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)file\n"+
                    "b)register\n"+
                    "c)byte\n"+
                    "d)none of the above\n");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(3000);
				return true;
			}
		}

	}


	return false;
}


public static boolean fetchQuestions4(String name) {
	System.out.println("4.who is called as Boss of Computer?");
	System.out.println("a)operating system\n"+
            "b)Micro processor\n"+
	           "c)Hard disk\n"+
            "d)RAM\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("a")) {
		candidate.setAmount(5000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
		
					System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(5000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)operating system\n"+
						            "b)Micro processor\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(5000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a)operating system\n"+
				            "b)Micro processor\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(5000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(3000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
								
									System.out.println("option a = 100%\n" + "option b = 5%\n" + "option c = 98%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(5000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(3000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)operating system\n"+
						            "b)Micro processor\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
					
									System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c =0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)operating system\n"+
								            "b)Micro processor\n"+
									           "c)Hard disk\n"+
								            "d)RAM\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)operating system\n"+
		            "b)Micro processor\n"+
			           "c)Hard disk\n"+
		            "d)RAM\n");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				candidate.setAmount(5000);
				return true;
			}
		}

	}


	return false;
}


public static boolean fetchQuestions5(String name) {
	System.out.println("5.The variables which are created only once?");
	System.out.println("a)variables\n"+
            "b)local variables\n"+
	           "c)instance variables\n"+
            "d)static variables\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("d")) {
		candidate.setAmount(10000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					
					System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 100%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(10000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)instance variables\n"+
						            "d)static variables\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(10000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
									           "c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
											"c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)instance variables\n"+
				            "d)static variables\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						candidate.setAmount(10000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 100%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("d")) {
								if(skip_cnt!=0) {
									candidate.setAmount(10000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
											"c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
								
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 100%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
											"c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(10000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 100%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
											"c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)instance variables\n"+
						            "d)static variables\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
							
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c =0%\n" + "option d = 100%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)variables\n"+
								            "b)local variables\n"+
											"c)instance variables\n"+
								            "d)static variables\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)variables\n"+
		            "b)local variables\n"+
					"c)instance variables\n"+
		            "d)static variables\n");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				candidate.setAmount(10000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestions6(String name){
	System.out.println("6.The strings which cannot be modified?");
	System.out.println("a)Mutable \n"+
            "b)Immutable\n"+
	           "c)both a and b\n"+
            "d)None of these\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("b")) {
		candidate.setAmount(20000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
				
					System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Mutable \n"+
						            "b)Immutable\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(20000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a)Mutable \n"+
				            "b)Immutable\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
			
							System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
							
									System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(20000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
				
							System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Mutable \n"+
						            "b)Immutable\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
				
									System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c =0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Mutable \n"+
								            "b)Immutable\n"+
									           "c)both a and b\n"+
								            "d)None of these\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)Mutable \n"+
		            "b)Immutable\n"+
			           "c)both a and b\n"+
		            "d)None of these\n");
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				candidate.setAmount(20000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestions7(String name) {
	System.out.println("7.Who is the founder of c++?");
	System.out.println("a)Dennis Ritchie\n"+
            "b)Charles Babbage\n"+
	           "c)stroustrup\n"+
            "d)James Gosling\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		candidate.setAmount(30000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
				
					System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(30000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)stroustrup\n"+
						            "d)James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(30000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(30000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)stroustrup\n"+
				            "d)James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(30000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
						
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(30000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(30000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
						
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(30000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
				
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)stroustrup\n"+
						            "d)James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
					
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c =100%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)stroustrup\n"+
								            "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)Dennis Ritchie\n"+
		            "b)Charles Babbage\n"+
			           "c)stroustrup\n"+
		            "d)James Gosling\n");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(30000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestions8(String name) {
	System.out.println("7.Who is the founder of c?");
	System.out.println("a)Dennis Ritchie\n"+
            "b)Charles Babbage\n"+
	           "c)James Gosling\n"+
            "d)Ken thompson\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("a")) {
		candidate.setAmount(50000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
				
					System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(50000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Dennis Ritchie\n"+
				            "b)Charles Babbage\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(50000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(50000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Dennis Ritchie\n"+
						            "b)Charles Babbage\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a)Dennis Ritchie\n"+
				            "b)Charles Babbage\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(50000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;

							System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(50000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(50000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
							
									System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(50000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
				
							System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Dennis Ritchie\n"+
						            "b)Charles Babbage\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
						
									System.out.println("option a = 100%\n" + "option b = 0%\n" + "option c =0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Dennis Ritchie\n"+
								            "b)Charles Babbage\n"+
									           "c)James Gosling\n"+
								            "d)Ken thompson\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)Dennis Ritchie\n"+
		            "b)Charles Babbage\n"+
			           "c)James Gosling\n"+
		            "d)Ken thompson\n");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				candidate.setAmount(50000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestions9(String name) {
	System.out.println("9.RAM is also called as?");
	System.out.println("a)secondary memory\n"+
            "b)primary memory\n"+
	           "c)tertiary memory\n"+
            "d)All of the above\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("b")) {
		candidate.setAmount(80000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					
					System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(80000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)primary memory\n"+
							           "c)tertiary memory\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(80000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(80000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)primary memory\n"+
									           "c)tertiary memory\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b)primary memory\n"+
					           "c)tertiary memory\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(80000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(80000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(80000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
					
									System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(80000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c = 0%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)primary memory\n"+
									           "c)tertiary memory\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)primary memory\n"+
							           "c)tertiary memory\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
						
									System.out.println("option a = 0%\n" + "option b = 100%\n" + "option c =0%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)secondary memory\n"+
								            "b)primary memory\n"+
									           "c)tertiary memory\n"+
								            "d)All of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)secondary memory\n"+
		            "b)primary memory\n"+
			           "c)tertiary memory\n"+
		            "d)All of the above\n");
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				candidate.setAmount(80000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestions10(String name) {
	System.out.println("10.The strings which can be changed only once?");
	System.out.println("a)Both b and c\n"+
            "b)Immutable\n"+
	           "c)Mutable\n"+
            "d)None of the above\n"+
	           "e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		candidate.setAmount(100000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					
					System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)Immutable\n"+
							           "c)Mutable\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)Immutable\n"+
									           "c)Mutable\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b)Immutable\n"+
					           "c)Mutable\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
				
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
					
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(100000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
					
							System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c = 100%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)Immutable\n"+
									           "c)Mutable\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)Immutable\n"+
							           "c)Mutable\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4  = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
	
									System.out.println("option a = 0%\n" + "option b = 0%\n" + "option c =100%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Both b and c\n"+
								            "b)Immutable\n"+
									           "c)Mutable\n"+
								            "d)None of the above\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a)Both b and c\n"+
		            "b)Immutable\n"+
			           "c)Mutable\n"+
		            "d)None of the above\n");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(100000);
				return true;
			}
		}

	}


	return false;
}



}

	
