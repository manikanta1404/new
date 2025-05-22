# import socket

# def find_online_devices(network):
#     """
#     Sends a UDP broadcast to find devices on a Windows network.
#     Useful if ICMP & ARP are blocked.
#     """
#     sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
#     sock.settimeout(1)

#     online_devices = []
#     for last_octet in range(1, 255):
#         ip = f"{network}.{last_octet}"
#         try:
#             sock.sendto(b"Hello", (ip, 9))  # Port 9 (discard port)
#             sock.recvfrom(1024)  # If response received, device is online
#             online_devices.append(ip)
#         except socket.timeout:
#             pass
#         except Exception as e:
#             print(f"Error scanning {ip}: {e}")

#     return online_devices

# # Example Usage: Scan 192.168.1.x network
# network = "10.78.22"
# devices = find_online_devices(network)
# print("Online Devices Found:", devices)

# from scapy.all import ARP, Ether, srp

# def arp_scan(network):
#     pkt = Ether(dst="ff:ff:ff:ff:ff:ff") / ARP(pdst=network)
#     ans, _ = srp(pkt, timeout=2, verbose=False)
#     return [rcv.psrc for snd, rcv in ans] if ans else "No devices found"

# print(arp_scan("10.78.6.0/16"))

from pytube import YouTube

def Do
