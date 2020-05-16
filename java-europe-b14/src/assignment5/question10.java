package assignment5;

public class question10 {

	public static void main(String[] args) {
int code=500;
switch  (code){
	case 200:
		System.out.println("input: "+code);
		System.out.println("Display message: "+"ok");
		break;
	case 201:
		System.out.println("input: "+code);
		System.out.println("Display message: "+"Created");
		break;
			case 202:
				System.out.println("input: "+code);
				System.out.println("Display message: "+"Accepted");
				break;
				case 301:
					System.out.println("input: "+code);
					System.out.println("Display message: "+"Moved Permanently");
					break;
					case 303:
						System.out.println("input: "+code);
						System.out.println("Display message: "+"See other");
						break;
						case 304:
							System.out.println("input: "+code);
							System.out.println("Display message: "+"Not modified");
							break;
							case 307:
								System.out.println("input: "+code);
								System.out.println("Display message: "+"Not modified");
								break;
								case 400:
									System.out.println("input: "+code);
									System.out.println("Display message: "+"Bad Request");
									break;
									case 401:
										System.out.println("input: "+code);
										System.out.println("Display message: "+"Unauthorized");
										break;
										case 403:
											System.out.println("input: "+code);
											System.out.println("Display message: "+"Forbidden");
											break;
										case 404:
											System.out.println("input: "+code);
											System.out.println("Display message: "+"Not found");
											break;
										
										case 500:
											System.out.println("input: "+code);
											System.out.println("Display message: "+"Internal Server Error");
											break;
										case 503:
											System.out.println("input: "+code);
											System.out.println("Display message: "+"Service Unavailable");
											break;
											default:
												System.out.println("Invalid status code!");
											
			}
}
	}
